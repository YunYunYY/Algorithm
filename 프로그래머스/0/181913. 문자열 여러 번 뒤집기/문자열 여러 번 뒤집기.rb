def solution(my_string, queries)

    queries.each{|a|
        if a[0]==0
            my_string=my_string[a[0]..a[1]].reverse+my_string[a[1]+1..]
        else
            my_string=my_string[0..a[0]-1]+my_string[a[0]..a[1]].reverse+my_string[a[1]+1..]
        end
    }
    return my_string
end