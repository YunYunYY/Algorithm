def GoBack(hh, amt):
	hh -= amt
	if (hh >=0):
		return hh
	else:
		return hh+24

def GoForward(hh, amt):
	hh += amt
	if (hh <24):
		return hh
	else:
		return hh-24

tt = int(input())
hh, mm = tt //100, tt%100
print(tt, 'in Ottawa') 
print(GoBack(hh, 3)*100+mm, 'in Victoria')
print(GoBack(hh, 2)*100+mm, 'in Edmonton')  
print(GoBack(hh, 1)*100+mm, 'in Winnipeg')  
print(tt, 'in Toronto')
print(GoForward(hh, 1)*100+mm, 'in Halifax')   
mm = mm+30
if (mm >= 60):
	print(GoForward(hh, 2)*100+mm-60, "in St. John's")
else :
	print(GoForward(hh, 1)*100+mm, "in St. John's")