def solution(arr, queries)
    queries.each{|a|
        arr[a[0]], arr[a[1]] = arr[a[1]], arr[a[0]]
    }
    return arr
end