import sys
N = int(input())
A = list(map(int, input().split()))
l, r = A[0], A[1]
for i in range(2, N):
	if (l <= r):
		l += A[i]
	else:
		r += A[i]
nn = abs (l-r)
w =[100, 50, 20, 10, 5, 2, 1]
cnt =0
for i in range(len(w)):
	cnt += nn // w[i]
	nn = nn % w[i]
print(cnt)