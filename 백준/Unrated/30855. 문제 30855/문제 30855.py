import sys

def gcd (a, b):
	if (a<b):
		a, b = b, a
	while (b>0):
		if (a %b ==0):
			return b
		a, b = b, a%b
	return -1

def Frac(a, b, c):	# a+ b/c
	d1, n1 = a[0], a[1]
	d2, n2 = b[0]*c[1], b[1]*c[0]
	dd, nn = d1*n2 + d2*n1, n1*n2
	g = gcd(dd, nn)
	return [dd//g, nn//g]

def Calc(A):
	for i in range(N):
		if (A[i] == '('):		# 문법 체크를 위해 저장
			pp.append('(')
		elif (A[i] == ')'):		# 가장 최근에 들어간 거 4 개 : n1 + n2/n3
			if(len(pp) <4):
				return -1
			n3 = pp.pop()
			n2 = pp.pop()
			n1 = pp.pop()
			n0 = pp.pop()
			if ((len(n3) !=2) or (len(n2) !=2) or (len(n1) !=2) or (n0 !='(')) :
				return -1
			tt = Frac(n1, n2, n3)	#a/b 꼴로 변환 저장
			pp.append(tt)
		else:
			n = int(A[i])
			pp.append([n,1])		# a/1 로 저장
	return 1


N = int(input())
pp =[]
A = list(input().split())
ans = Calc(A)
if (ans ==-1):
	print (-1)
elif (len(pp) != 1):
	print (-1)
else:
	print(pp[-1][0], pp[-1][1])

