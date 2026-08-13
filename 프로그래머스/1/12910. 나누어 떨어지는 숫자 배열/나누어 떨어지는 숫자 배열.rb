def solution(arr, d)
    ans = []
    arr.each{|a|
        if a%d==0
            ans.append(a)
        end
    }
    ans.sort!
    if ans.size==0
        ans.append(-1)
    end
    
    return ans
end