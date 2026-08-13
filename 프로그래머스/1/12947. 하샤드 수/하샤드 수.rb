def solution(x)
    a=0
    b=x
    while b>0
        a=a+b%10
        b=b/10
    end
    if x%a==0
        return true
    else
        return false
    end
end