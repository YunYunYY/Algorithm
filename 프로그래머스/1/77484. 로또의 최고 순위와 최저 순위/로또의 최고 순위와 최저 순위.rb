def solution(lottos, win_nums)
    answer = [0,0]
    cntZ=0
    m=0
    lottos.each{|l|
        if l==0
            cntZ=cntZ+1
        else
            if win_nums.include?(l)
                m=m+1
            end
        end                
    }
    answer[0]=7-cntZ-m
    answer[1]=7-m
    if answer[0]==7
        answer[0]=6
    end
    if answer[1]==7
        answer[1]=6
    end
    
    return answer
end