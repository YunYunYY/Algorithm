def solution(arr):
    ii,jj=-1,-1
    for i in range(len(arr)):
        if arr[i]==2:
            ii=i
            break
    
    for j in range(len(arr)-1,0,-1):
        if arr[j]==2:
            jj=j
            break
    return [-1] if ii==-1 else arr[ii:jj+1]