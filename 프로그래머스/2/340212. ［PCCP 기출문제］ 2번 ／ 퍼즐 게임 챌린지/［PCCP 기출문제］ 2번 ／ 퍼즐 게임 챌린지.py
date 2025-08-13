def Eval(level, diffs, tts, lim):
    n = len(diffs)
    if (level < diffs[0]):
        return False
    penalty = tts[0]
    for i in range(1, n):
        if(level>=diffs[i]):
            penalty+=tts[i]
        else:
            penalty+=tts[i]+(tts[i]+tts[i-1])*(diffs[i]-level)
    if (penalty <= lim):
        return True
    else:
        return False


def solution(diffs, times, limit):
    l, u = min(diffs), max(diffs)
    mm = u
    while (l <= u):
        mid = (l+u) //2
        if (Eval(mid, diffs, times, limit) == True):
            mm = min(mm, mid)
            u=mid-1
        else:
            l=mid+1
    return mm