def solution(d, budget)
    d.sort!
    answer = 0
    d.each{|i|
        if budget-i<0
            break
        end
        budget=budget-i
        answer=answer+1
    }
    
    return answer
end