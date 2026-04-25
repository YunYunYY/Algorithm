a,b = gets.split
a=a.to_i
b=b.to_i
#puts a,b
if a+b>a-b
    puts a+b,a-b
else
    puts a-b,a+b
end
