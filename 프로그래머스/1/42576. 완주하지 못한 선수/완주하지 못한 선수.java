import java.util.HashSet;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashSet<String> aa = new HashSet<>();
        for(int i=0;i<participant.length;i++){
            if(aa.contains(participant[i]))
                aa.remove(participant[i]);
            else aa.add(participant[i]);
        }
        
        for(int i=0;i<completion.length;i++){
            if(aa.contains(completion[i]))
                aa.remove(completion[i]);
            else aa.add(completion[i]);
        }
        String s="";
        for(String k : aa)
            s=k;
        return s;
    }
}