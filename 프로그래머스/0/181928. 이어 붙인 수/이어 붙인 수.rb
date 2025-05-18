def solution(num_list)
    a=0
    b=0
    num_list.each do |i|
        i%2==0 ? a=a*10+i : b=b*10+i
    end
    return a+b
end