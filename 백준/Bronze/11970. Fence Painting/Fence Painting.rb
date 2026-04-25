a=Array.new(101,0)
2.times{
    b,c=gets.split
    b=b.to_i
    c=c.to_i
    for i in b..c-1
        a[i]=1
    end
}
puts a.sum