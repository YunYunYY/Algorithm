a = gets.to_i
cnt = 0
b,c,d=2,0,0
loop do
    c=a-b-1
    d=1
    loop do
        break if c-d<2
        cnt+=1
        c-=1
        d+=1
    end
    b=b+2
    break if b>a-2
end

puts cnt