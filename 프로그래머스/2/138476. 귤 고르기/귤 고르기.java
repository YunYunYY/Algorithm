import java.util.*;
class Solution {
    public int solution(int k, int[] tt) {
        
        int[] aa = new int[10000001];
        for(int i=0;i<tt.length;i++)
            aa[tt[i]]++;
        Arrays.sort(aa);
        
        int t = aa.length-1, cnt = 0;
        while(cnt<k){
            cnt+=aa[t];
            t--;
        }
        
        return aa.length-1-t;
    }
}