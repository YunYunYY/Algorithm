
a = gets.to_i
aa=Array.new(a){Array.new(a)}
for i in 0..a-1
    s=gets
    for j in 0..a-1
        aa[i][j]=s[j]
    end
end

b = gets.to_i
i,j=0,0

if b==1
    0.upto(a-1){|i|
        0.upto(a-1){|j|
            print aa[i][j]
        }
        puts ""
    }

elsif b==2
    0.upto(a-1){|i|
        1.upto(a){|j|
            print aa[i][a-j]
        }
        puts ""
    }
    
else
    1.upto(a){|i|
        0.upto(a){|j|
            print aa[a-i][j]
        }
        puts ""
    }
end

