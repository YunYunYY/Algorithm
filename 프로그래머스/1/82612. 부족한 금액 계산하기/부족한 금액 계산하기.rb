def solution(price, money, count)
    a = 0
    for i in 1..count
        a=a+price*i
    end
    a=a-money
    if a<0
        a=0
    end
    return a
    
end