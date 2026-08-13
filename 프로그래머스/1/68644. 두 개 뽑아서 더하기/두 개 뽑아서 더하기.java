import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> aa = new HashSet<>();
        for(int i=0;i<numbers.length;i++)
            for(int j=i+1;j<numbers.length;j++)
                aa.add(numbers[i]+numbers[j]);
        int[] ans = new int[aa.size()];
        int id=0;
        for(int i : aa){
            ans[id]=i;
            id++;
        }
        Arrays.sort(ans);
        return ans;
    }
}