a,b,c = gets.split
a=a.to_i
b=b.to_i-1
c=c.to_i-1
aa = Array.new(a) {Array.new(a)}
for i in 0..a-1
    aa[i]=gets.split.to_a
end

aa.each_index{|id|
    aa[id].each_index{|idd|
        aa[id][idd]=aa[id][idd].to_i
    }
}
feeling = false
for i in 0..a-1
    if aa[i][c]>aa[b][c]
        feeling=true
    end
    if aa[b][i]>aa[b][c]
        feeling=true
    end
end

if feeling
    puts "ANGRY"
else
    puts "HAPPY"
end