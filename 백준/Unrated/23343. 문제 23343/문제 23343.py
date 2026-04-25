A, B = input().split()
if ((A.isdigit() == False) or (B.isdigit()==False)):
	print("NaN")
else:
	print(int(A)-int(B))