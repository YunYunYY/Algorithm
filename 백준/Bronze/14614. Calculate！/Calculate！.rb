a,b,c=gets.split().map(&:to_i)
if c%2==0
    puts a
else
    puts a^b
end