n=gets.to_i
a=gets.split.to_a
b,c=gets.split.map(&:to_i)

pe = 0
for i in 0..n-1
    a[i]=(a[i].to_i-b)
    if a[i]<=0
        next
    elsif (a[i]%c==0)
        pe+=(a[i]/c)
    else
        pe+=(a[i]/c+1)
    end
end

puts pe+n
