def solution(answers)
    a=[1,2,3,4,5]
    b=[2,1,2,3,2,4,2,5]
    c=[3,3,1,1,2,2,4,4,5,5]
    ans = [0,0,0]
    for i in 0..(answers.length-1)
        if a[i%a.length]==answers[i]
            ans[0]=ans[0]+1
        end
        if b[i%b.length]==answers[i]
            ans[1]=ans[1]+1
        end
        if c[i%c.length]==answers[i]
            ans[2]=ans[2]+1
        end
    end
    
    k=ans.max
    
    q=[]
    for i in 0..2
        if k==ans[i]
            q.append(i+1)
        end
    end
    
    return q
end