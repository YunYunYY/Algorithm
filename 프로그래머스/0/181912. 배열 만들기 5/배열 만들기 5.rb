def solution(intStrs, k, s, l)
    answer = []
    intStrs.each{|a|
        b=a[s,l].to_i
        if b>k
            answer.append(b)
        end
    }
    return answer
end