h,m,s=gets.split.map(&:to_i)
ti=h*60*60+m*60+s
gets.to_i.times{
    a=gets
   if a[0]=='1'
        a,b=a.split.map(&:to_i)
        ti+=b
   elsif a[0]=='2'
        a,b=a.split.map(&:to_i)
        ti-=b
   else
        while ti<0
            ti+=86400
        end
        while ti>=86400
            ti-=86400
        end
       puts "#{ti/3600} #{(ti%3600)/60} #{ti%60}"
   end
}