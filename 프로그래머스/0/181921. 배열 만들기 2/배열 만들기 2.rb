def solution(l, r)
    answer = []
    c=1
    loop do
        d=c.to_s(2)
        d=d.to_i*5
        break if d>r
        if d>=l
            answer.append(d)
        end
        c=c+1
    end
    return answer.empty? ? [-1] : answer
end