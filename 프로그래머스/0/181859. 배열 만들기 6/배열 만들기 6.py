def solution(arr):
    answer = []
    for i in arr:
        if not answer:
            answer.append(i)
        else:
            if answer[-1]==i:
                answer.pop()
            else:
                answer.append(i)
    return answer if answer else [-1]