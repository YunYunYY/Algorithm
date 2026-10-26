import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> aa = new Stack<>();
        aa.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(aa.empty()) aa.push(s.charAt(i));
            else if(aa.peek()==s.charAt(i)) aa.pop();
            else aa.push(s.charAt(i));
        }
        
        if(aa.size()==0) return 1;
        else return 0;
    }
}