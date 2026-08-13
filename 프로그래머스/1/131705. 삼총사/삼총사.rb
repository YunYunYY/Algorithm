def solution(number)
    answer=0
    number.combination(3){
        |c|
        if c.sum==0
            answer=answer+1
        end
    }
    return answer
end


