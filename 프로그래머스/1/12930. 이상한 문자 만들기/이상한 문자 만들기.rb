def solution(s)
    ans = ''
    k=0
    for i in 0..(s.length-1)
        if s[i]==' '
            ans.concat(' ')
            k=0
        else
            if k%2==0
                ans.concat(s[i].upcase)
            else
                ans.concat(s[i].downcase)
            end
            k=k+1
        end
    end
    
   
    
    return ans
end