def solution(ineq, eq, n, m)
    answer = 0
    if eq=="!"
        if ineq==">"
            answer=(n>m)?1:0
        else
            answer=(n<m)?1:0
        end
    else
        if ineq==">"
            answer=(n>=m)?1:0
        else
            answer=(n<=m)?1:0
        end
    end
    return answer
end