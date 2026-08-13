def solution(array)
    array.sort!
    answer = array[array.length/2]
    return answer
end