import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        ArrayList<String> aa = new ArrayList<>();
        
        int answer = 0;
        for(String s : cities){
            s=s.toUpperCase();
            if(aa.indexOf(s)==-1){
                answer+=5; aa.add(s);
                if(aa.size()>cacheSize) aa.remove(0);
            }
            else{
                answer++;
                aa.remove(s); aa.add(s);
            }
        }
        
        return answer;
    }
}