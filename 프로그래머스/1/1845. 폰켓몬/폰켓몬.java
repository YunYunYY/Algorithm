import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> aa = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            aa.add(nums[i]);
        int answer = aa.size()>nums.length/2?nums.length/2:aa.size();
        return answer;
    }
}