trout = int(input())
pike = int(input())
pickerel = int(input())
total =  int(input())

i, cnt =0, 0
while (i*trout <=total):
	j = 0
	while (i*trout + j*pike <=total):
		k = 0
		while (i*trout + j*pike + k*pickerel <=total):
			if (i+j+k !=0):
				cnt += 1
				print(i, 'Brown Trout,', j, 'Northern Pike,', k, 'Yellow Pickerel')
			k = k+1
		j = j+1
	i = i+1
print('Number of ways to catch fish:', cnt)