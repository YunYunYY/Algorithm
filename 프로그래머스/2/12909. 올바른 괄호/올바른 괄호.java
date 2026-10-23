import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> aa = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            if(k=='(') aa.push(1);
            else{
                if(aa.isEmpty()){
                    answer=false; break;
                }
                else aa.pop();
            }
            
        }
        
        if(!aa.isEmpty()) answer=false;
        return answer;
    }
}