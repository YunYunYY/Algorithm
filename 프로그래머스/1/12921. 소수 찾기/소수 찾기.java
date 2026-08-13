import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] aa = new boolean[n+1];
        Arrays.fill(aa,true);
        aa[0]=false;aa[1]=false;
        for(int i=2;i<=n;i++){
            if(aa[i]){
                answer++;
                for(int j=i*2;j<n+1;j+=i)
                    aa[j]=false;
            }
        }
        return answer;
    }
}