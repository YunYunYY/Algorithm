def solution(arr)
    i=0
    stk = []
    until i>=arr.length do
        if stk.empty?
            stk.append(arr[i])
            i=i+1
        elsif stk.last<arr[i]
            stk.append(arr[i])
            i=i+1
        else
            stk.pop
        end
    end
    return stk
end