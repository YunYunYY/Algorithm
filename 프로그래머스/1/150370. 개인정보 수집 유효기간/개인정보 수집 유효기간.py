def date(today):
    ty,tm,td=map(int,today.split("."))
    t=(ty-2000)*12*28+tm*28+td
    return t

def solution(today, terms, privacies):
    answer = []
    tt={}
    n=date(today)
    
    for i in terms:
        s=i.split(" ")
        tt[s[0]]=int(s[1])*28
    
    
    for i in range(len(privacies)):
        ss,pp=privacies[i].split(" ")
        ss=date(ss)
        pp=tt[pp]
        if n-ss>=pp:
            answer.append(i+1)
        
    
    return answer