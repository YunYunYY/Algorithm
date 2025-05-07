def solution(a, b)
    a1=a.to_s<<b.to_s
    return a1.to_i<2*a*b ? 2*a*b : a1.to_i
end