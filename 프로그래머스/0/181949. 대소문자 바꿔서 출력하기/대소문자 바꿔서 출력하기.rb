s1 = gets.chomp
for i in 0..(s1.length-1)
    a=s1[i]
    if a>='a'&&a<='z'
        print a.upcase
    else
        print a.downcase
    end
end