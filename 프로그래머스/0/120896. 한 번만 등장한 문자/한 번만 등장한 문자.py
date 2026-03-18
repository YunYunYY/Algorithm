def solution(s):
    aa=[0]*26
    for i in s:
        ii=ord(i)-97
        aa[ii]+=1
    answer = ''
    for i in range(26):
        if aa[i]==1:
            answer+=(chr(i+97))
    return answer