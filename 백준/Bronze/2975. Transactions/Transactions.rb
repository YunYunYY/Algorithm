while s = gets
    if s=="0 W 0\n"
        break
    end
    a,l,b = s.split
    a=a.to_i
    b=b.to_i
    if l=="W"
        a-=b
    else
        a+=b
    end

    if a<-200
        puts "Not allowed"
    else
        puts a
    end
end