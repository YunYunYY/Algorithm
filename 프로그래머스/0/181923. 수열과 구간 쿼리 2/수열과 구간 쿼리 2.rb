def solution(arr, queries)
    answer = []
    queries.each{|a|
        c=1000001
        for i in a[0]..a[1]
            if arr[i]>a[2]
                c=[c,arr[i]].min
            end
        end
        answer.append(c==1000001?-1:c)
    }
    return answer
end