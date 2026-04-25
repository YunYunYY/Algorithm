a=gets.split.to_a
a[0]=a[0].to_i
a[2]=a[2].to_i
a[4]=a[4].to_i



def method(q,w,e)
   if w=='+'
       return q+e
   elsif w=='-'
       return q-e
   elsif w=='*'
       return q*e
   else
        if q*e<0
            return -((q.abs)/(e.abs))
        else
            return q/e
        end
   end
end

puts [method(method(a[0],a[1],a[2]),a[3],a[4]),method(a[0],a[1],method(a[2],a[3],a[4]))].min,[method(method(a[0],a[1],a[2]),a[3],a[4]),method(a[0],a[1],method(a[2],a[3],a[4]))].max