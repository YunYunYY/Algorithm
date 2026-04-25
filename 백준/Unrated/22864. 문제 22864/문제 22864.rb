a,b,c,m = gets.split.map(&:to_i)
ti,pr=0,0
24.times{
    ti+=a
    pr+=b
    if ti>m
        ti-=a
        ti-=c
        pr-=b
    end
    if(ti<0)
        ti=0
    end
    if pr<0
        pr=0
    end
}

puts pr