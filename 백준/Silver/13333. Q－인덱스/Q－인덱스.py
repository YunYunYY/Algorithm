import sys
N = int(input())
A = list(map(int, input().split()))
A.sort()
mm =0

for i in range(N-1, -1, -1):
	cnt = 0
	for j in range(N):
		if (A[j] >= i+1):
			cnt = cnt+1
#	print(i+1, cnt)
	if (cnt >= i+1):
		mm = i+1
		break

print(mm)

	