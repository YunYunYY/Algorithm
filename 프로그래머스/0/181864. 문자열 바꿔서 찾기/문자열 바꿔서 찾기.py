def solution(myString, pat):
    myString=myString.translate(myString.maketrans('AB','BA'))
    return 0 if myString.find(pat)==-1 else 1