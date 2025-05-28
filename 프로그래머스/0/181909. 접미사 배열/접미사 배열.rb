def solution(my_string)
    answer = []
    my_string.length.times{|i| answer<<my_string[(i-1)..]}
    return answer.sort
end