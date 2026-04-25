a=gets.split.to_a
for i in 0..3
    a[i]='SRP'.index(a[i])
end
ou = ""
if a[0]==a[1]
    if a[0]==2
        if(a[2]==0||a[3]==0)
            ou="TK"
        end
    else
        if(a[2]==a[0]+1||a[3]==a[0]+1)
            ou="TK"
        end
    end
end

if(a[2]==a[3])
    if a[2]==2
        if(a[0]==0||a[1]==0)
            ou="MS"
        end
    else
        if(a[0]==a[2]+1||a[1]==a[2]+1)
            ou="MS"
        end
    end
end

if ou==""
    puts "?"
else
    puts ou
end