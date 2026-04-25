import sys
input = sys.stdin.readline
N = int(input())
C = input()
cnt = 1
for i in range(N-1):
	t = input()
	if (C!=t):
		cnt = cnt+1
		C =t
print(cnt+1)