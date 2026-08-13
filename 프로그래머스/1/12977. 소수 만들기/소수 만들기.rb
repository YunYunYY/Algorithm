def solution(n)
    answer = 0

    a=Array.new(3001,true)
    a[0]=false;a[1]=false
    for i in 2..3000
        if a[i]==true
            k=i*2
            while k<3001
                a[k]=false
                k=k+i
            end
        end
    end

    for i in 0..(n.length-1)
        for j in i+1..(n.length-1)
            for k in j+1..(n.length-1)
                b=n[i]+n[j]+n[k]
                if a[b]==true
                    answer=answer+1
                end
            end
        end
    end
    
    return answer
end