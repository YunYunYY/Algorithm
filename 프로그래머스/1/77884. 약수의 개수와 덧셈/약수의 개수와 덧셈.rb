def solution(l, r)
    answer = 0
    for i in l..r
        a = qq(i)
        if a%2==0
            answer=answer+i
        else
            answer=answer-i
        end
    end
    return answer
end

def qq(a)
    q = 0
    for i in 1..a/2
        if a%i==0
            q=q+1
        end
    end
    return q+1
end