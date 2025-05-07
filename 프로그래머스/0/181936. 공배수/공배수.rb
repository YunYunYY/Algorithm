def solution(number, n, m)
    answer = 0
    return number%n==0 && number%m==0 ? 1 : 0
end