def solution(n, control)
    control.each_char{ |c|
        case c
            when "w"
            n=n+1
            when "s"
            n=n-1
            when "d"
            n=n+10
            when "a"
            n=n-10
        end
    }
    return n
end