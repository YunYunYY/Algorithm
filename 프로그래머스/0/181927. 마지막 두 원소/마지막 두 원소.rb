def solution(num_list)
    return num_list[-1]-num_list[-2]>0 ? num_list.append(num_list[-1]-num_list[-2]) : num_list.append(num_list[-1]*2)
end