def solution(num_list):
    answer = 0
    for i in num_list:
        while 1:
            if i==1:
                break
            if i%2==0:
                i//=2
            else:
                i=(i-1)//2
            answer+=1
    return answer