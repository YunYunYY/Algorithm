def solution(my_string, alp):
    answer = ''
    return my_string.translate(my_string.maketrans(alp,alp.upper()))