n=gets.to_i
a,b=gets.split.map(&:to_i)
c=(a/2+b)>n ? n:a/2+b
puts c