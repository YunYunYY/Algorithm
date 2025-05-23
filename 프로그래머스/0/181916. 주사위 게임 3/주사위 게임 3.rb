def solution(a, b, c, d)
    aa=[a,b,c,d].sort
    if aa[0]==aa[3]
        return 1111*a
    elsif aa[0]==aa[2]
        return (10*aa[0]+aa[3]).pow(2)
    elsif aa[1]==aa[3]
        return (10*aa[1]+aa[0]).pow(2)
    elsif aa[0]==aa[1]&&aa[2]==aa[3]
        return (aa[0]+aa[2])*(aa[0]-aa[2]).abs
    elsif aa[0]==aa[1]
        return aa[2]*aa[3]
    elsif aa[1]==aa[2]
        return aa[0]*aa[3]
    elsif aa[2]==aa[3]
        return aa[0]*aa[1]
    else
        return aa[0]
    end
end