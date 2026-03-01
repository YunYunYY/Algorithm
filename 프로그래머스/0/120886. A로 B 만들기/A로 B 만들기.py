def solution(before, after):
    before=list(before)
    after=list(after)
    return int(sorted(before)==sorted(after))