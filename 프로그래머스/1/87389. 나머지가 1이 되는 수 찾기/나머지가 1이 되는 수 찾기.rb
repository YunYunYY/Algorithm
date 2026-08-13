def solution(n)
    answer = 0
    for i in 2..n
        if n%i==1
            break
        end
    end
    return i
end