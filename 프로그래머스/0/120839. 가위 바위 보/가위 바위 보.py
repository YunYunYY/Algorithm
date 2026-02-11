def solution(rsp):
    answer = ''
    aa={'2':'0','0':'5','5':'2'}
    for i in rsp:
        answer=answer+aa[i]
    return answer