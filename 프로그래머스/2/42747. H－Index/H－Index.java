import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int[] aa = new int[citations[citations.length-1]+1];
        for(int i=0;i<citations.length;i++){
            for(int j=0;j<=citations[i];j++) aa[j]++;
        }
        for(int i=0;i<aa.length;i++){
            if(aa[i]>=i)answer=i;
        }
        
        return answer;
    }
}