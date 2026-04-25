id = 1
gets.to_i.times{
    a = gets.split.to_a
    for i in 0..2
        a[i]=a[i].to_i
    end
    a=a.sort

    if a[2]>=a[1]+a[0]
        puts "Case ##{id}: invalid!"
    elsif a[2]==a[0]
        puts "Case ##{id}: equilateral"
    elsif a[2]==a[1]||a[1]==a[0]
        puts "Case ##{id}: isosceles"
    else
        puts "Case ##{id}: scalene"
       
    end
    id=id+1
}