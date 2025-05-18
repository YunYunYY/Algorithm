def solution(a, d, included)
    answer = 0
    for i in 0..included.length-1
        answer=answer+(included[i] ? 1:0)*(d*i+a)
    end
    return answer
end