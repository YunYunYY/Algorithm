import sys
input = sys.stdin.readline
sys.setrecursionlimit(200000)

def dfs(n, f):
	mm = -1
	for e in G[n]:
		if (e == f):
			continue
		mm = max(mm, dfs(e, n))
	mm += 1
	toLeaf[n] = mm
	return mm

def cdfs(n, f):
	ss = 0
	for e in G[n]:
		if (e == f):
			continue
		if (toLeaf[e] <D):
			continue
		ss += cdfs(e, n)
	return ss+2

N, R, D = map(int, input().split())
R = R-1
G= []
for i in range(N):
	G.append([])
for i in range(N-1):
	n1, n2 = map(int, input().split())
	n1, n2 = n1-1, n2-1
	G[n1].append(n2)
	G[n2].append(n1)

toLeaf =[-1]*N
dfs(R, -1)
print(cdfs(R, -1) -2)
