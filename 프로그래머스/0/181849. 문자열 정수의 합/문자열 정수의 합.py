def solution(num_str):
    answer = 0
    n=int(num_str)
    while n>0:
        answer+=n%10
        n//=10
    return answer