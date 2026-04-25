a=gets.split.to_a
a.each_index{|id|
    a[id]=a[id].to_i
}
if (a[0]>100||a[1]>100||a[2]>200||a[3]>200||a[4]>300||a[5]>300||a[6]>400||a[7]>400||a[8]>500)
    puts "hacker"    
elsif a.sum>99
    puts "draw"
else
    puts "none"
end