import sys
input = sys.stdin.readline
N, B, D = map (int, input().split())
A = list(map(int, input().split()))
A.sort()	# 싼 거부터 넣으려고
cur, cnt = 0, 0	# cur는 현재까지 사용한 예산
st =[]	
for i in range(N):
	if (cur +A[i] <=B):		# 할인없이 구매 가능
		cur = cur+A[i]
		cnt +=1
		st.append(A[i])
	else:
		st.append(A[i])	# 일단 넣은 후
		cur += A[i]
		while (len(st) >0 and D>0):
			e = st.pop()
			D -= 1
			if (cur - e//2 <=B):  # 도달
				cnt +=1		# 선물 수 증가
				cur = cur - e//2
				break
			else:			# 계속 뺌
				cur = cur - e//2
print(cnt)
