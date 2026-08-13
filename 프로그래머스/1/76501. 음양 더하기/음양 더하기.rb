def solution(absolutes, signs)
    answer = 0
    for i in 0..(signs.size-1)
        if signs[i]==true
            answer=answer+absolutes[i]
        else
            answer=answer-absolutes[i]
        end
    end
    return answer
end