gets.to_i.times{
    a = gets.to_i
    b=Math.log2(a).to_i
    if 2**b==a
        puts 1
    else
        puts 0
    end
}