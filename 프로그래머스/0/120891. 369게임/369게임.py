def solution(order):
    answer = 0
    while order>0:
        i=order%10
        if i ==3 or i==6 or i==9:
            answer+=1
        order//=10
    return answer