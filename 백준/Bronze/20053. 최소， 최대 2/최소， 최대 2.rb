gets.to_i.times{
    a = gets.to_i
    b = gets.split.to_a
    b.each_index{|id|
        b[id]=b[id].to_i
    }
    puts (b.min.to_s+" "+b.max.to_s)
}