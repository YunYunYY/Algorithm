import java.util.*;

class Solution {
    static class State{
        public int x;
        public int y;
        public int cnt;
        
        State(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int solution(int[][] maps) {
        boolean[][] vv = new boolean[maps.length][maps[0].length];
        
        Queue<State> qq = new LinkedList<>();
        qq.add(new State(0,0,1));
        vv[0][0]=true;
        while(!qq.isEmpty()){
            State state = qq.poll();
            if(state.x==maps.length-1 && state.y==maps[0].length-1) 
                return state.cnt;
            for(int i=0;i<4;i++){
                int nx = state.x+dir[i][0];
                int ny = state.y+dir[i][1];
                if(!Valid(nx,ny,maps.length,maps[0].length)) continue;
                if(maps[nx][ny]==1 && !vv[nx][ny]){
                    vv[nx][ny]=true;
                    qq.add(new State(nx,ny,state.cnt+1));
                }
            }
        }

        return -1;
    }
    static Boolean Valid(int r, int c, int N, int M){
        if(r<0 || r>=N) return false;
        if(c<0 || c>=M) return false;
        return true;
    }
}