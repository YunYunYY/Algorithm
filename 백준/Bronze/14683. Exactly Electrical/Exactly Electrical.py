r1, c1 = map(int, input().split())
r2, c2 = map(int, input().split())
dd = int(input())
mv = abs(r1-r2) + abs(c1-c2)
if (dd < mv):
	print('N')
else:
	if ((dd %2) == (mv %2)):
		print('Y')
	else:
		print('N')