i,j=0,0
ms,mc,ml=0,51,180
gets.to_i.times{
    s,c,l=gets.split.map(&:to_i)
    if s>ms
        ms=s
        mc=c
        ml=l
        i=j
    elsif s==ms
        if c<mc
            mc=c
            ml=l
            i=j
        elsif c==mc&&l<ml
            ml=l
            i=j
        end
        
    end
    j=j+1
}
puts i+1