gets
aa=gets.split.to_a
aa.each_with_index do |element, index|
    aa[index]=aa[index].to_i
end
puts aa.max