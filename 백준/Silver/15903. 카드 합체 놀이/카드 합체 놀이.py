import sys
input = sys.stdin.readline

from queue import PriorityQueue
N, C = map (int, input().split())
A = list(map(int, input().split()))
pq = PriorityQueue()
for i in range(N):
	pq.put(A[i])
for i in range(C):
	t1 = pq.get()
	t2 = pq.get()
	pq.put(t1+t2)
	pq.put(t1+t2)
ss = 0
n = pq.qsize()
for i in range(n):
	ss = ss+ pq.get()
print(ss)