import java.util.*;
class Solution {
    public int solution(int[] pp, int limit) {
        int cnt = 0;
        Arrays.sort(pp);
        
        int i = 0, j = pp.length-1;
        while(i<=j){
            if(i==j){
                i++;j--;
            }
            else if(pp[i]+pp[j]>limit){
                j--; 
            }
            else{
                i++;j--;
            }
            cnt++;
        }
        
        return cnt;
    }
}