import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> aa = new HashSet<>();
        char a = words[0].charAt(0);
        for(int i=0;i<words.length;i++){
            char b = words[i].charAt(0);
            if(a!=b) return new int[] {i%n+1,i/n+1};
            if(aa.contains(words[i])) return new int[] {i%n+1,i/n+1};
            aa.add(words[i]);
            a=words[i].charAt(words[i].length()-1);
        }
        int[] answer = {0,0};
        return answer;
    }
}