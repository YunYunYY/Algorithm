a = gets.to_i
b = 0
while(a>9)
    c=1
    while(a>0)
        c*=(a%10)
        a/=10
    end
    a=c
    b=b+1
end
puts b