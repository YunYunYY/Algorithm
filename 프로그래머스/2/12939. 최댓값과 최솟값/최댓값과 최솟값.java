import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        
        ArrayList<Integer> aa = new ArrayList<>();
        while(st.hasMoreTokens()){
            aa.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(aa);
        return ""+aa.get(0)+" "+aa.get(aa.size()-1);
    }
}