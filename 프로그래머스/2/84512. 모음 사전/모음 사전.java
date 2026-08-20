import java.util.*;
class Solution {
    static String[] aa = {"A","E","I","O","U"};
    static int cnt;
    static Map<String,Integer> bb = new HashMap<>();
    public int solution(String word) {
        int answer = 0;
        for(int i=0;i<5;i++)
            aaa(aa[i]);
        return bb.get(word);
    }
    static void aaa(String s){
        cnt++;
        bb.put(s,cnt);
        if(s.length()==5) return;
        for(int i=0;i<5;i++)
                aaa(s+aa[i]);
        
    }
    
}