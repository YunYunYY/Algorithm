def solution(n, m)
    answer = []
    answer.append(gcd(n,m))
    answer.append(n*m/answer[0])
    return answer
end

def gcd(a,b)
    if a<b
        a,b=b,a
    end
    while a!=0
        a=a%b
        if a==0
            return b
        end
        a,b=b,a
    end
end