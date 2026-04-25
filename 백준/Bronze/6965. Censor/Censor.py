import sys
input = sys.stdin.readline
N = int(input())

for i in range(N):
	R =[]
	ss = input().split()
	for j in range(len(ss)):
		if (len(ss[j])==4):
			R.append('****')
		else:
			R.append(ss[j])
	print(' '.join(R) +"\n")