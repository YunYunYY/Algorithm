class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] aa = new int[n+1];
        int t = 1, cnt = 0;
        for(int i=1;i<n+1;i++){
            for(int j=t;j<=i;j++){
                aa[j]+=i;
                if(aa[j]==n)cnt++;
                if(aa[j]>=n)t=j+1;
            }
        }
        return cnt;
    }
}