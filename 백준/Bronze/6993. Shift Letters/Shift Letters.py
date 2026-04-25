import sys
input = sys.stdin.readline
N = int(input())
R = []
for i in range(N):
	a, b = input().split()
	b, l = int(b), len(a)
	R.append("Shifting "+a +" by "+str(b)+" positions gives us: "+ a[-b:]+a[:l-b])
print('\n'.join(R))