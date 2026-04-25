m,mn=0.0,0
i=0
3.times{
    a,b=gets.split.map(&:to_f)
    a*=10
    b*=10
    if(a>=5000)
        a-=500
    end
    
    if m<b/a
        m=b/a
        mn=i
    end
    i+=1
}

puts "SNU"[mn]