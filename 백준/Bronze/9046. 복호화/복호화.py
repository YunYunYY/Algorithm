import sys
input = sys.stdin.readline
def Proc(line):
	cnt =[0]*26
	for i in range(len(line)):
		if (line[i] == ' '):
			continue
		tt = ord(line[i]) - ord('a')
		cnt[tt] +=1
	mm = max(cnt)
	if (cnt.count(mm) >=2):
		return '?'
	e = cnt.index(mm)
	return chr( ord('a')+ e)

N = int(input())
R =[]
for i in range(N):
	ss = input().strip()
	R.append(Proc(ss))
print("\n".join(R))