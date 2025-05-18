def solution(code)
    answer = ''
    mode = false
    for i in 0..code.length-1
        if mode
            if code[i]=="1"
                mode=false
            else
                if i%2==1
                    answer=answer+code[i]
                end                
            end
        else
            if code[i]=="1"
                mode=true
            else
                if i%2==0
                    answer=answer+code[i]
                end
            end
        end
    end
    return answer.empty? ? "EMPTY":answer
end