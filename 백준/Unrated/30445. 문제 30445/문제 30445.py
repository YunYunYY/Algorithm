def MyRound(tt):
	tt = int(tt*1000)
	if (tt % 10 >=5):
		tt = tt //10 +1
	else:
		tt = tt//10
	return tt/100

Happy = set(list("HAPPY"))
Sad = set(list("SAD"))
S = input().strip()
ph, ps = 0, 0
for i in range(len(S)):
	if ((S[i] in Happy)==True):
		ph +=1
	if ((S[i] in Sad)==True):
		ps +=1
if (ph + ps==0):
	print("50.00")
else:
	ans = 100* ph / (ph+ps)
	ans = MyRound(ans)
	print("%.2f"%ans)

