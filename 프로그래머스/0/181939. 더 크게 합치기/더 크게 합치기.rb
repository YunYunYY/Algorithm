def solution(a, b)
    answer = 0
    return [a.to_s<<b.to_s,b.to_s<<a.to_s].max.to_i
end