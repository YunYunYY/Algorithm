import sys
input = sys.stdin.readline
dic ={}
dic['A'], dic['B']=0, 0
R = []
while (True):
	inst = input().split()
	if (inst[0] =='7'):
		break
	elif (inst[0] == '1'):
		dic[inst[1]] = int(inst[2])
	elif (inst[0] == '2'):
		R.append(str(dic[inst[1]]))
	elif (inst[0] == '3'):
		dic[inst[1]] = dic[inst[1]] + dic[inst[2]]
	elif (inst[0] == '4'):
		dic[inst[1]] = dic[inst[1]] * dic[inst[2]]
	elif (inst[0] == '5'):
		dic[inst[1]] = dic[inst[1]] - dic[inst[2]]
	elif (inst[0] == '6'):
		dic[inst[1]] = dic[inst[1]] // dic[inst[2]]
print('\n'.join(R))
