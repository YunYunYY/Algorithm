def solution(my_string, is_suffix)
    answer = []
    my_string.length.times{|i| answer<<my_string[(i-1)..]}
    return answer.include?(is_suffix) ? 1 : 0
end