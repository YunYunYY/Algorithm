def solution(i, j, k):
    answer = 0
    for n in range(i,j+1):
        for t in str(n):
            if t == str(k):
                answer+=1
    return answer