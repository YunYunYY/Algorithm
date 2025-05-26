def solution(number)
    answer = 0
    number.each_char{|a| answer=answer+(a.ord-'0'.ord)}
    return answer%9
end