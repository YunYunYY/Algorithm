dir = 0
dd = "NESW"
for i in range(10):
	tt = int(input())
	if (tt ==1):
		dir = (dir+1) %4
	elif (tt==3):
		dir = (dir+3) %4
	else:
		dir = (dir+2) %4
print(dd[dir])
