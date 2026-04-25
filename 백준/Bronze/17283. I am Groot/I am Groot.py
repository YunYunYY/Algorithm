# 백준 17283
# 경찰대학 2019 ChickenReallyGood 대회 A번

N = int(input())
R = int(input())
base = 2
ll = N
ss = 0
while True:
	ll = int(ll * (R/ 100))
	if (ll <= 5):
		break
	ss = ss+base*ll
	base = base*2
print(ss)

