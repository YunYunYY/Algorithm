def solution(n)
    answer = 0
    for i in 1..n
        if n%i==0
            answer+=i
        end
    end
    return answer
end