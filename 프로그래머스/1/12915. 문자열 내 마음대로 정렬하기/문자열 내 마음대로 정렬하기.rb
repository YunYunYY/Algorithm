def solution(s, n)
    s.sort!
    s.sort_by!{|a| a[n]}
    return s
end