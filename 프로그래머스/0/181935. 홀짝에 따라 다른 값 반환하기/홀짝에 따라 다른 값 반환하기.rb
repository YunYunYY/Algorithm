def solution(n)
    answer = 0
    if n%2==0
        i=2
        (n/2).times{
            answer=answer+i*i
            i=i+2
        }
    else
        i=1
        (n/2+1).times{
            answer=answer+i
            i=i+2
        }
    end
    return answer
end