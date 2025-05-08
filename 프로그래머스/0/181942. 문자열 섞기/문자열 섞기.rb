def solution(s1, s2)
    a=""
    for i in 0..(s1.length-1)
        a<<s1[i]
        a<<s2[i]
    end
    return a
end