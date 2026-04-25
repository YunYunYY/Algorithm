N = int(input())
cnt, n =0,1

while (True):
	d, s = n, n
	while (d >0):
		s = s*10 + d %10
		d = d //10
	if (s >N):
		break
	cnt = cnt+1
	n = n+1

n = 1
while (True):
	d, s = n//10, n
	while (d >0):
		s = s*10 + d %10
		d = d //10
	if (s >N):
		break
	cnt = cnt+1
	n = n+1
print(cnt)
