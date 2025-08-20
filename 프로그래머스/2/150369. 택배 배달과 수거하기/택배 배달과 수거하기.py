import heapq

def GetMax(p1, p2):
    mm = -1
    if (p1):
        mm = max(mm, -p1[0][0])
    if (p2):
        mm = max(mm, -p2[0][0])
    return mm
def rem(qq, cap):
    while (qq):
        home,amt=heapq.heappop(qq)
        if(amt>cap):
            heapq.heappush(qq,(home,amt-cap))
            return
        elif(amt==cap):
            return
        else:
            cap=cap-amt
    
def solution(cap, n, deliveries, pickups):
    dq, pq = [], []
    for i in range(n):
        if (deliveries[i] !=0):
            heapq.heappush(dq, (-i-1, deliveries[i]))
        if(pickups[i]!=0):
            heapq.heappush(pq,(-i-1,pickups[i]))
    ans=0
    while (dq or pq):
        ans+=GetMax(dq, pq) *2
        rem(dq,cap)
        rem(pq,cap)
        
    return ans