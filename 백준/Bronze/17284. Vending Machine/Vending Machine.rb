a=5000
b=[500,800,1000]
m=gets.split.to_a
m.each{|mm|
    a-=b[mm.to_i-1]
}
puts a