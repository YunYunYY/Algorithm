import sys
input = sys.stdin.readline
N = int(input())
Val, Lev, Seq, Left, Right= 0,1,2,3,4

def MakeAns():
	rr = -1
	for i in range(N):
		if (A[i][Lev] ==1):
			rr = i
			break
	if (rr ==-1):
		print(-1)
		return

	que, fr, cnt =[], 0, 0
	que.append(rr)
	while (len(que) != fr):
		cnt +=1
		if (A[que[fr]][Left] != -1):
			que.append(A[que[fr]][Left])
		if (A[que[fr]][Right] != -1):
			que.append(A[que[fr]][Right])
		fr = fr+1
	if (cnt != N):
		print(-1)
		return
	for i in range(N):
		if (A[i][Left] != -1):
			A[i][Left] = A[A[i][Left]][Seq] +1
		if (A[i][Right] != -1):
			A[i][Right] = A[A[i][Right]][Seq] +1
#	print(A)
	A.sort(key=lambda x: x[Seq])
#	print(A)
	R =[]
	for i in range(N):
		R.append(str(A[i][Left])+" "+str(A[i][Right]))
	print("\n".join(R))

#-------------

A = []
for i in range(N):
	v, lv= map(int, input().split())
	A.append([v, lv, i, -1, -1])

A.sort(key=lambda x:x[Val])

st =[]
for i in range(N):
#	print("See", A[i][Val], A[i][Seq])
	if (len(st)==0):
		st.append(i)
		continue
	while ((len(st) >0) and (A[st[-1]][Lev] > A[i][Lev]+1)):
		st.pop()
#		print("popped")
	if (len(st) >0):
		if (A[i][Lev] == A[st[-1]][Lev]-1):
			A[i][Left] = st[-1]
#			print("L", i, st[-1])
			st.pop()
		if ((len(st)>0) and (A[i][Lev] == A[st[-1]][Lev]+1)):
			A[st[-1]][Right] = i
#			print("R", st[-1], i)
	st.append(i)

#	print("stage")
#	for j in range(len(st)):
#		print(A[st[j]])
#	print()
#	print(st)

MakeAns()




