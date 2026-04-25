N = int(input())
A =  [0, 0, 1, 0]
B  = [0, 0, 0, 0]

for i in range(1, N):
	if (i % 2 ==1):
		B[2], B[3] = 0, sum(A)
	else :
		B[2], B[3] = sum(A), 0
	A[0], A[1], A[2], A[3] = A[1], A[2], A[3]+B[2], B[3]
print(sum(A))