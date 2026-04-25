a=gets.to_i
b=gets.to_i
c=gets.to_i


ic,mo = b,0

while ic<a
    ic+=c
    mo=mo+1
end
puts (250+mo*100)