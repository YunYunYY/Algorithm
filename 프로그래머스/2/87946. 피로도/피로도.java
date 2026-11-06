class Solution {
    static boolean[] aa = new boolean[8];
    public int solution(int k, int[][] dd) {
        int answer = -1;
        aa=new boolean[dd.length];
        return aaa(0,k,dd);
    }
    static int aaa(int a, int k, int[][] dd){
        if(a==dd.length) return a;
        int p = -1;
        for(int i=0;i<dd.length;i++){
            if(!aa[i]&&k>=dd[i][0]){
                aa[i]=true;
                p = Math.max(p,aaa(a+1,k-dd[i][1],dd));
                aa[i]=false;
            }
        }
        return Math.max(a,p);
    }
}