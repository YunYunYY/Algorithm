def chtoM(s):
    h,m=int(s[0:2]),int(s[3:5])
    return h*60+m

def ToStr(mm):
	hh, mm = mm //60, mm % 60
	if (hh <10):
		ss = "0"+str(hh)+":"
	else:
		ss = str(hh)+":"
	if (mm < 10):
		ss += "0"+str(mm)
	else:
		ss += str(mm)
	return ss

def Check(tar, st, ed):
	if ((tar >=st) and (tar <=ed)):
		return ed
	else:
		return tar
	

def solution(video_len, pos, op_start, op_end, commands):
	vl=chtoM(video_len)
	pos=chtoM(pos)
	ops=chtoM(op_start)
	ope=chtoM(op_end)
	pos=Check(pos,ops,ope)
	for i in commands:
		if i=="next":
			pos=min(vl,pos+10)
		else:
			pos=max(0,pos-10)
		pos=Check(pos,ops,ope)
	return ToStr(pos)