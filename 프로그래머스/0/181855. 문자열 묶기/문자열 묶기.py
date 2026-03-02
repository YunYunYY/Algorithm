def solution(strArr):
    answer = [0]*30
    for i in strArr:
        answer[len(i)-1]+=1
    return max(answer)