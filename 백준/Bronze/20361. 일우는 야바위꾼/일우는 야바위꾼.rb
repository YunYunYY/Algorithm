a, b, c = gets.split
c=c.to_i
c.times{
    q,w=gets.split
   if q==b
       b=w
   elsif w==b
       b=q
   end
}
puts b