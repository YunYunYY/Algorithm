a,b = gets.split.map(&:to_i)
c=gets.split.to_a
d = 1
c.each{|e|
    e=(e.to_i)%b
    d*=e
    d%=b
}
puts d