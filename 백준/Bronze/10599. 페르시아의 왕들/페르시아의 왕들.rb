while true do
   a=gets.split().to_a
   if(a[0].to_i==0&&a[1].to_i==0&&a[2].to_i==0&&a[3].to_i==0) 
    break
   end
   puts("#{a[2].to_i-a[1].to_i} #{a[3].to_i-a[0].to_i}") 
end