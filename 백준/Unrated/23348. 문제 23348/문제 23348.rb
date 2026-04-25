a,b,c=gets.split.map(&:to_i)
mm=-1
gets.to_i.times{
    q=0
    3.times{
        w,e,r=gets.split.map(&:to_i)
        q+=(w*a+e*b+r*c)
    }
    if q>mm
        mm=q
    end
}
puts mm