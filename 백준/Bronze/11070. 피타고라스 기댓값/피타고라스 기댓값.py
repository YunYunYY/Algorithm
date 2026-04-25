import sys
input = sys.stdin.readline
T = int(input())
R =[]
for t in range(T):
	N, M = map(int, input().split())
	S, L = [0]*N, [0]*N
	for i in range(M):
		a, b, n1, n2 = map(int, input().split())
		a, b = a-1, b-1
		S[a] += n1
		S[b] += n2
		L[a] += n2
		L[b] += n1
	P = [0]*N
	for i in range(N):
		if (S[i]+L[i] ==0):
			continue
		P[i] = int(1000*S[i]*S[i] / (S[i]*S[i]+L[i]*L[i]))
	R.append(max(P))
	R.append(min(P))

R = list(map(str, R))
print("\n".join(R))
	
