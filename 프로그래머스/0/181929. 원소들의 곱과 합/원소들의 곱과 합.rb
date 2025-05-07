def solution(num_list)
    answer = 0
    k=1
    num_list.each{|a|k=k*a}
    if  k<num_list.sum.pow(2)
        answer=1
    end
    return answer
end