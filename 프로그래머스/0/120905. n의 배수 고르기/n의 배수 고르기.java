import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        for (int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0)
                ans.add(numlist[i]);
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}