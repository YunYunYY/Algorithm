gets.to_i.times do
    a,b = gets.split
    a=a.to_i
    b=b.to_i
    if a<12
        puts -1
    elsif b<4
        puts -1
    else
        puts 11*b+4
    end
end
