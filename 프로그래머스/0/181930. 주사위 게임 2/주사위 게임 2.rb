def solution(a, b, c)
    d=[a,b,c].uniq
    return d.length==1 ? (a+b+c)*(a.pow(2)+b.pow(2)+c.pow(2))*(a.pow(3)+b.pow(3)+c.pow(3)) : d.length==2 ? (a+b+c)*(a.pow(2)+b.pow(2)+c.pow(2)) : a+b+c
end