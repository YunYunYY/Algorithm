def solution(my_string, num1, num2):
    a=''
    for i in range(len(my_string)):
        if i==num1:
            a+=(my_string[num2])
        elif i==num2:
            a+=(my_string[num1])
        else:
            a+=(my_string[i])
    return a