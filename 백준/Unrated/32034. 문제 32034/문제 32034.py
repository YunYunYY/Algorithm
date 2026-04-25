import copy

def Proc(S):
	st, cnt =[], 0
	for i in range(len(S)):
		if (S[i] == 'T'):
			if (len(st) ==0):
				st.append(i)
			else:
				diff = i -st[-1]-1
				if ((diff %2)==0):
					cnt += diff//2 + diff//2 +1
					st.pop()
				else:
					st.append(i)
	if (len(st) != 0):
		return -1
	else:
		return cnt

T = int(input())
R =[]
for t in range(T):
	N = int(input())
	R.append(Proc(input().strip()))

R = list(map(str, R))
print("\n".join(R))