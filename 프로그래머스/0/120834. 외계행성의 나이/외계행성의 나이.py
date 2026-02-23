def solution(age):
    return str(age).translate(str(age).maketrans("0123456789","abcdefghij"))