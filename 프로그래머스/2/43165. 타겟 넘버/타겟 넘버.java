class Solution {
    static int cnt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dps(0,target,numbers,0);
        return cnt;
    }
    static void dps(int n, int t, int[] nn, int id){
        if(id==nn.length){
            if(n==t) cnt++;
            //System.out.println(n);
            return;
        }
        else{
            dps(n+nn[id],t,nn,id+1);
            dps(n-nn[id],t,nn,id+1);
        }
    }
}