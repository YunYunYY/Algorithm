a=gets.to_i
b=0
5.times{
    b+=(a%10)**5
    a/=10
}
puts b