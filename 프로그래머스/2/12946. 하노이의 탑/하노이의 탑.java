import java.util.*;
class Solution {
    static List<int[]> pp=new ArrayList<>();
    public int[][] solution(int n) {
        int[][] answer = {};
        hanoi(n,1,3,2);
        return pp.toArray(new int[0][]);
    }
    static void hanoi(int n, int from, int to, int sub){
        if(n==1)
            pp.add(new int[] {from, to});
        else{
            hanoi(n-1,from,sub,to);
            pp.add(new int[] {from, to});
            hanoi(n-1,sub,to,from);
        }
    }
}