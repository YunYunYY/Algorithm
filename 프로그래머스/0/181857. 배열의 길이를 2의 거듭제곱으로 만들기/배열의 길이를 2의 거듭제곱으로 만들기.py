def solution(arr):
    i = 1
    while 1:
        if i<len(arr):
            i*=2
        else:
            while i>len(arr):
                arr.append(0)
            break
        
    return arr