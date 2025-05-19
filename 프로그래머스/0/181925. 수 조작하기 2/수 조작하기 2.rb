def solution(numLog)
    answer = ''
    for i in 0..numLog.length-2
       a=numLog[i+1]-numLog[i]
        case a
            when 1
            answer=answer+"w"
            when -1
            answer=answer+"s"
            when 10
            answer=answer+"d"
            when -10
            answer=answer+"a"
        end
    end
    return answer
end