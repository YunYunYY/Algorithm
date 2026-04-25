a,b=gets.split.map(&:to_i)
ans=1
for i in a..b
    q=i*(i+1)/2%14579
    ans*=q
    ans%=14579
end
puts ans