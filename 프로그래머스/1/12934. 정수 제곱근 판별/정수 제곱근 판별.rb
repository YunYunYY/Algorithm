def solution(n)
    ans = Integer.sqrt(n)
    if n==ans*ans
        return (ans+1)*(ans+1)
    else
        return -1
    end
end