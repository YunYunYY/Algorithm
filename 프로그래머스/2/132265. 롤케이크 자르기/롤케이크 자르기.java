import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> aa = new HashMap<>();
        HashMap<Integer, Integer> bb = new HashMap<>();

        aa.put(topping[0],1);
        for(int j=1;j<topping.length;j++) 
            bb.put(topping[j],bb.getOrDefault(topping[j],0)+1);
        if(aa.size()==bb.size()) answer++;
        
        for(int i=1;i<topping.length;i++){
            aa.put(topping[i],aa.getOrDefault(topping[i],0)+1);
            if(bb.get(topping[i])==1) bb.remove(topping[i]);
            else bb.put(topping[i],bb.get(topping[i])-1);
            if(aa.size()==bb.size()) answer++;
        }
        return answer;
    }
}