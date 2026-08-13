import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] ans = {-1};
            return ans;
        }
        else{
        ArrayList<Integer> aa = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            aa.add(arr[i]);
        aa.remove(Collections.min(aa));
        
        
        
            int[] ans = new int[arr.length-1];
            for(int i=0;i<arr.length-1;i++){
                ans[i]=aa.get(i);
            }
            return ans;
        }
        
    }
}