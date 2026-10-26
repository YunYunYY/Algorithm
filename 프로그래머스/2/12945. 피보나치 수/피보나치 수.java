class Solution {
    public int solution(int n) {
        int[] aa = new int[1000002];
        aa[0]=0;aa[1]=1;
        int i = 2;
        while(i<=n){
            aa[i]=(aa[i-2]+aa[i-1])%1234567;
            i++;
        }
        return aa[n];
    }
}