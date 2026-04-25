a, b = gets.split
a=a.to_i
b=b.to_i
c = 1
a.times{
    (b-1).times{
        print(c," ")
        c=c+1
    }
    print(c,"\n")
    c=c+1
}