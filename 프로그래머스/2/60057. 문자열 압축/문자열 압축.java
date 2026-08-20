import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1;i<s.length()/2+1;i++){
            answer=Math.min(sss(s,i).length(),answer);
        }
        return answer;
    }
    static String sss (String s, int a){
        StringBuilder sb = new StringBuilder();
        List<String> aa = new ArrayList<>();
        for(int i=0;i<s.length();i+=a){
            if(i+a>s.length())
                aa.add(s.substring(i,s.length()));
            else aa.add(s.substring(i,i+a));
        }
        String k = "";
        int id = -1;
        for(String i : aa){
            if(id==-1){
                k=i;
                id=1;
            }
            else if(k.equals(i)){
                id++;
            }
            else{
                if(id!=1) sb.append(id);
                sb.append(k);
                id=1;k=i;
            }
        }
        if(id!=1) sb.append(id);
        sb.append(k);
        return sb.toString();
    }
}