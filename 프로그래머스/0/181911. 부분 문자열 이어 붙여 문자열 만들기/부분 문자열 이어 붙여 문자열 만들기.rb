def solution(my_strings, parts)
    answer = ''
    my_strings.length.times{|i|
        answer<<my_strings[i][parts[i][0]..parts[i][1]]
    }
    return answer
end