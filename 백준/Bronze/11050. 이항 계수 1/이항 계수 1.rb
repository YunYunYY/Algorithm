a,b=gets.split.map(&:to_i)
f=1
for i in 2..a
    f*=i
end
for i in 2..b
    f/=i
end
for i in 2..(a-b)
    f/=i
end
puts f