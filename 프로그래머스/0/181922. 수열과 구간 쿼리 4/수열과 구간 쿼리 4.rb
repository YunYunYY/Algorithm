def solution(arr, queries)
    queries.each{|a|
        for i in a[0]..a[1]
            if i%a[2]==0
                arr[i]=arr[i]+1
            end
        end
    }
    return arr
end