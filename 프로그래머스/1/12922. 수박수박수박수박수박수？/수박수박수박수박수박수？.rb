def solution(n)
    answer = ''
    (n/2).times{
        answer.concat("수박")
    }
    if n%2==1
        answer=answer+"수"
    end
    return answer
end