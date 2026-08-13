def solution(s)
    a=[]
    for i in 0..s.length-1
        a.append(s[i])
    end
    a.sort!
    a.reverse!
    ans=""
    for i in 0..s.length-1
        ans.concat(a[i])
    end
    return ans
end