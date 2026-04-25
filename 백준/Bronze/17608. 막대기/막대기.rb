a=[]
gets.to_i.times{
    a.push(gets.to_i)
}
a=a.reverse
mak,max=0,0
a.each{|aa|
    if aa>max
        mak+=1
        max=aa
    end 
}

puts mak