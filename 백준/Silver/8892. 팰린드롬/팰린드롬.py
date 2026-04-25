import sys
input = sys.stdin.readline

def Palin(s):
	l, r = 0, len(s)-1
	while (l <r):
		if (s[l] != s[r]):
			return False
		l, r = l+1, r-1
	return True

def Check():
	for i in range(N):
		for j in range(N):
			if (i==j):
				continue
			ss = A[i]+A[j]
			if (Palin(ss)== True):
				return ss
	return "0"

T = int(input())
R = []
for t in range(T):
	N = int(input())
	A=[]
	for i in range(N):
		A.append(input().strip())
	R.append(Check())
print("\n".join(R))

	