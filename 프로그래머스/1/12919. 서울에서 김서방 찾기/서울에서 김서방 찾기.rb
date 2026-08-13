def solution(seoul)
    answer = ''
    for i in 0..(seoul.length)
        if seoul[i]=="Kim"
            answer="김서방은 #{i}에 있다"
            break
        end
    end
    return answer
end