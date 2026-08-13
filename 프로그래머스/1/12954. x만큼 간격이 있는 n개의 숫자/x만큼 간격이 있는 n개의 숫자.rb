def solution(x, n)
    answer = []
    k=x
    n.times{
        answer.append(k)
        k=k+x
    }
    return answer
end