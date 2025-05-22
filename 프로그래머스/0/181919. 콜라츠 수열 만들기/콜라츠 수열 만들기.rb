def solution(n)
    answer = [n]
    until n==1 do
        if n.even?
            n=n/2
        else
            n=3*n+1
        end
        
        answer.append(n)
    end
    return answer
end