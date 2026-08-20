import java.util.*;
class Solution {
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static int[][] dir1 = {{2,0},{-2,0},{0,2},{0,-2}};
    static int[][] dir2 = {{1,1},{-1,1},{-1,-1},{1,-1}};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int i=0;i<5;i++){
            answer[i]=aaa(places[i]);
        }
        return answer;
    }
    static int aaa(String ss[]){
        int ans = 1;
        char[][] bb = new char[5][5];
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                bb[i][j]=ss[i].charAt(j);
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(bb[i][j]=='P'){
                    //맨 1
                    for(int k=0;k<4;k++){
                        int ni = i+dir[k][0];
                        int nj = j+dir[k][1];
                        if(ni<0||ni>=5)continue;
                        if(nj<0||nj>=5)continue;
                        if(bb[ni][nj]=='P') return 0;
                    }
                    //맨2
                    for(int k=0;k<4;k++){
                        int ni = i+dir1[k][0];
                        int nj = j+dir1[k][1];
                        if(ni<0||ni>=5)continue;
                        if(nj<0||nj>=5)continue;
                        if(bb[ni][nj]=='P' && 
                           bb[(ni+i)/2][(nj+j)/2]!='X') 
                            return 0;   
                    }
                    
                    //맨2 - 대각선
                    for(int k=0;k<4;k++){
                        int ni = i+dir2[k][0];
                        int nj = j+dir2[k][1];
                        if(ni<0||ni>=5)continue;
                        if(nj<0||nj>=5)continue;
                        if(bb[ni][nj]=='P' && (bb[ni][j]!='X'||bb[i][nj]!='X')) 
                            return 0;
                    }
                }
            }
        }
        
        
        return ans;
    }
}