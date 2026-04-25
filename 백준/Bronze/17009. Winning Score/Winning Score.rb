a,b=0,0
i = 3
loop do
    a+=i*gets.to_i
    i-=1
    break if i<1
end
i = 3
loop do
    b+=i*gets.to_i
    i-=1
    break if i<1
end
if(a>b)
    puts "A"
elsif (a<b)
    puts "B"
else
    puts "T"
end