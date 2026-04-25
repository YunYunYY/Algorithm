a=gets.to_i
n=1
loop do
    break if n*(n+1)/2>=a
    n=n+1
end
b=1
c=n
n=n*(n+1)/2

loop do
    break if n==a
    n=n-1
    b=b+1
    c=c-1
end

puts "#{b} #{c}"