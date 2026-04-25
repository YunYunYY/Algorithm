import sys
input = sys.stdin.readline
N = int(input())
A = list(map(int, input().split()))
A.sort()
ss = sum (A)
bb = ss //N
B =[bb]*N

for i in range(ss % N):
	B[N-i-1] +=1

cnt =0
for i in range(N):
	if (A[i] <= B[i]):
		continue
	cnt += A[i]- B[i]

print(cnt)
