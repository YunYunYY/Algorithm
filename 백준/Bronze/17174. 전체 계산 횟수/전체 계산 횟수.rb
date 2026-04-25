a,b=gets.split
a=a.to_i
b=b.to_i
c=a
while a>0
    a/=b
    c+=a
end
puts c