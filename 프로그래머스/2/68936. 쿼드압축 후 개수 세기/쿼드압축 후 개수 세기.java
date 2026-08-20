class Solution {
    static int[] answer= new int[2];
    public int[] solution(int[][] arr) {
        aaa(0,0,arr.length,arr);
        return answer;
    }
    static void aaa(int x, int y, int s, int[][]arr){
        if(bbb(x,y,s,arr)) {
            answer[arr[x][y]]++;
        }
        else{
            aaa(x,y,s/2,arr);
            aaa(x+s/2,y,s/2,arr);
            aaa(x,y+s/2,s/2,arr);
            aaa(x+s/2,y+s/2,s/2,arr);
        }
                
    }
    static boolean bbb(int x, int y, int s, int[][]arr){
        int key = arr[x][y];
        for(int i=x;i<x+s;i++)
            for(int j=y;j<y+s;j++)
                if(arr[i][j]!=key)
                    return false;
        return true;
    }
}