def solution(my_string, overwrite_string, s)
    answer = my_string.insert(s,overwrite_string)
    answer.slice!(s+overwrite_string.length..s+overwrite_string.length*2-1)
    return answer
end