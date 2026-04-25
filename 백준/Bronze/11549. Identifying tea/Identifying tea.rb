a = gets.to_i
b = gets.split.to_a
c = 0
b.each{ |ii|
    if(a==ii.to_i)
        c=c+1
    end
   # puts ii
}
puts c