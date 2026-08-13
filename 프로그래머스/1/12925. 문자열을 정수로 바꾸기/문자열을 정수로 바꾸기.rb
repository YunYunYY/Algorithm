def solution(s)
    answer=0
    if s[0]=='-' or s[0]=='+'
        answer = s.slice(1..(s.length)).to_i
        if(s[0]=='-')
            answer=-answer
        end
    else answer=s.to_i
    end
    
    return answer
end