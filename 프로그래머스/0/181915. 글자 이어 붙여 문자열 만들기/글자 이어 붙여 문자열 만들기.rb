def solution(my_string, index_list)
    answer = ''
    index_list.each{|i|answer<<my_string[i]}
    return answer
end