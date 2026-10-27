import java.util.*;
class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> aa = new HashSet<>();
        
        for(int i=1;i<=elements.length;i++){
            for(int j=0;j<elements.length;j++){
                int a = 0;
                for(int k=j;k<j+i;k++){
                    a+=elements[k%elements.length];
                }
                aa.add(a);
                //System.out.println(a);
            }
        }
        return aa.size();
    }
}