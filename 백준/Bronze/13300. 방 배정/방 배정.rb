a=[0,0,0,0,0,0]
b=[0,0,0,0,0,0]
c,d=gets.split.map(&:to_i)
c.times{
    q,w=gets.split.map(&:to_i)
    if q==0
        a[w-1]=a[w-1]+1
    else
        b[w-1]=b[w-1]+1
    end
}
r=0
a.each{|aa|
   if aa%d==0
    r=r+aa/d
   else
    r=r+aa/d+1
   end     
}

b.each{|bb|
    if bb%d==0
     r=r+bb/d
    else
     r=r+bb/d+1
    end     
 }
puts r