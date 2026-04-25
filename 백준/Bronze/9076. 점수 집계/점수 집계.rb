gets.to_i.times{
    a=gets.split.to_a
    for i in 0..a.length-1
        a[i]=a[i].to_i
    end
    a=a.sort
    if(a[3]-a[1]>=4)
        puts "KIN"
    else
        puts a[1]+a[2]+a[3]
    end
}