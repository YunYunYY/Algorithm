import sys
input = sys.stdin.readline

def Diff(a):
	ll = len(a)
	dd = a[1] -a[0]
	for i in range(ll-1):
		if (a[i+1] - a[i] != dd):
			return None
	return dd

N = int(input())
for i in range(N):
	t = list(map(int, input().split()))
	u = t[1:]
	dd = Diff(u)
	if (dd == None):
		print('The sequence', u, 'is not an arithmetic sequence.')
	else:
		k, e = [], u[-1]
		for i in range(5):
			e = e+ dd
			k.append(e)
		print('The next 5 numbers after', u, 'are:', k)