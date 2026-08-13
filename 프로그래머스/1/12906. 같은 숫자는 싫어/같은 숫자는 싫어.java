import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==aa.get(aa.size()-1))
                continue;
            aa.add(arr[i]);
        }
        
       int[] ans = new int[aa.size()];
        for(int i=0;i<aa.size();i++)
            ans[i]=aa.get(i);

        return ans;
    }
}