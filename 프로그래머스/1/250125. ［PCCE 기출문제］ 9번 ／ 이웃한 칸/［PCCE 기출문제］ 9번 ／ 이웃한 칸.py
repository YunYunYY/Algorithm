def solution(board, h, w):
    answer = 0
    n=len(board)
    dir=[[0,1],[1,0],[-1,0],[0,-1]]
    color=board[h][w]
    for i in range(4):
        nh,nw=h+dir[i][0],w+dir[i][1]
        if (nh<0 or nh>=n) or (nw<0 or nw>=n):
            continue
        if(board[nh][nw]==color):
            answer+=1
    
    return answer