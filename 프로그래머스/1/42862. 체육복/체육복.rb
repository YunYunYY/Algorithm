def solution(n, lost, reserve)
    cnt=Array.new(n,1)
    lost.each{|l|
        cnt[l-1]=cnt[l-1]-1
    }
    reserve.each{|r|
        cnt[r-1]=cnt[r-1]+1
    }
    if cnt[0]==0
        if cnt[1]==2
            cnt[0]=1
            cnt[1]=1
        end
    end
    
    for i in 1..n-1
        if cnt[i]==0
            if cnt[i-1]==2
                cnt[i]=1
                cnt[i-1]=1
            elsif cnt[i+1]==2
                cnt[i]=1
                cnt[i+1]=1
            end
        end
    end
    
    if cnt[n-1]==0
        if cnt[n-2]==2
            cnt[n-1]=1
            cnt[n-2]=1
        end
    end
    
    return n-cnt.count(0)
end