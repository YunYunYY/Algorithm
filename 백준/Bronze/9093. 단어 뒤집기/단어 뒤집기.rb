gets.to_i.times{
    s = gets.split.to_a
    for i in 0..s.length-2
        print s[i].reverse+" "
    end
    puts s.last.reverse
}