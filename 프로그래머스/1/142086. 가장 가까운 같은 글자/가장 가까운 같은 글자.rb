def solution(s)
    answer = []
    al = Array.new(26,-1)
    for i in 0..(s.length-1)
        a = s[i].ord-'a'.ord
        if al[a]==-1
            answer.append(-1)
        else
            answer.append(i-al[a])
        end
        
        al[a]=i
    end
    return answer
end