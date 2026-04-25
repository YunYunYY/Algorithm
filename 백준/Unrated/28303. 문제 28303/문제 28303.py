import sys
input = sys.stdin.readline
N, K = map(int, input().split())
A = list(map(int, input().split()))

L, R = [0]*N, [0]*N
tt = -(N-1)*K
L[0] = -A[0] + tt
for i in range(1, N):
	tt += K
	L[i] = max(-A[i]+tt, L[i-1])

tt = -(N-1)*K
R[N-1] = -A[N-1] + tt
for i in range(N-2, -1, -1):
	tt += K
	R[i] = max(-A[i]+tt, R[i+1])

mm = max(A[0]+ R[1], A[N-1]+L[N-2])


cp = (N-2)*K
for i in range(1, N-1):
	tt = A[i]+ L[i-1] + cp
	mm = max(mm, tt)
#	print(A[i], A[i]+ L[i-1], tt)
	cp = cp-K

cp = (N-2)*K
for i in range(N-2, 0, -1):
	tt = A[i]+ R[i+1] + cp
	mm = max(mm, tt)
#	print(A[i], A[i]+ R[i+1], tt)
	cp = cp-K

print(mm)

