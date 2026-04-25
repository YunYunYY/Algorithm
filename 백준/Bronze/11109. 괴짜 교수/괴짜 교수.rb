gets.to_i.times{
    a = gets.split.to_a
    a.each_index{|id|
        a[id]=a[id].to_i
    }
    if a[0]+a[1]*a[3]<a[1]*a[2]
        puts "parallelize"
    elsif a[0]+a[1]*a[3]==a[1]*a[2]
        puts "does not matter"
    else
        puts "do not parallelize"
    end
}