def solution(num_list, n):
    answer = []
    for i in range(0,len(num_list),n):
        k=[]
        for j in range(i,i+n):
            k.append(num_list[j])
        answer.append(k)
    return answer