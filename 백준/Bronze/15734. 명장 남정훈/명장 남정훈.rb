a=gets.split.to_a
a.each_index{|id|
    a[id]=a[id].to_i
}
b = [a[0],a[1]].min*2+[(a[0]-a[1]).abs,a[2]].min*2

if(a[2]-(a[0]-a[1]).abs>2)
    b+=((a[2]-(a[0]-a[1]).abs)/2*2)
end
puts b