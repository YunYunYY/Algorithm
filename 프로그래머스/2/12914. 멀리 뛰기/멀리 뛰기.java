class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] aa = new long[n+1];
        aa[0]=1;aa[1]=1;
        for(int i=2;i<=n;i++)
            aa[i]=(aa[i-1]+aa[i-2])%1234567;
        return aa[n];
    }
}