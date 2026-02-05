def solution(my_string):
    answer = 0
    for i in my_string:
        if i>='1' and i<='9':
            answer=answer+int(i)
    return answer