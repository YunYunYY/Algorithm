def Check(n):
	t = str(n)
	while (len(t) < len(S)):
		n = n+1
		t = t+str(n)
#	print(t)
	if (t==S):
		return n
	else:
		return -1

S = input().strip()
for i in range(1,len(S)+1):
	ll = Check(int(S[:i]))
	if (ll != -1):
		print(S[:i], ll)
		break
