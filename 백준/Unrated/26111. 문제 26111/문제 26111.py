T = input().strip()
N = len(T)
depth, cnt, loc = 0, 0, 0
while (loc < N-1):
	if (T[loc] == ')'):
		depth -=1
	elif (T[loc] == '('):
		if (T[loc+1] ==')'):
			cnt += depth
			loc += 1
		else:
			depth +=1
	loc = loc+1
print(cnt)