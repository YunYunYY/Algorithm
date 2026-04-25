import sys
input = sys.stdin.readline

def Fibo(lim):
	f0, f1 = 0,1
	while (f1 <= lim):
		t = f1
		f1 = f1+f0
		f0 = t
	return f0

def Proc(n):
	ll = []
	while (n >0):
		t = Fibo(n)
		ll.append(t)
		n = n -t
	ll.reverse()
	ll = list(map(str, ll))
	return (' '.join(ll))

N = int(input())
R =[]
for i in range(N):
	R.append(Proc(int(input())))
print("\n".join(R))
