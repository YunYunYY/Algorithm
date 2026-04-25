gets;s=gets.delete("\n").reverse
M=1234567891
r=31
a=0
s.each_byte{|c|
    a*=r
    a%=M
    a+=c-96
}
puts a