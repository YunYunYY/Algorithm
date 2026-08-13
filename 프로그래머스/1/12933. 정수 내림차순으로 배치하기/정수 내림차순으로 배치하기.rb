def solution(n)
    a=[]
    while(n>0)
        a.append(n%10)
        n=n/10
    end
    a.sort!
    answer = 0
    a.reverse_each{|aa|
        answer=answer*10
        answer=answer+aa
    }
    
    
    
    
    
    return answer
end