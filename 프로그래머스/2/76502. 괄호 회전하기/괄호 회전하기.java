import java.util.*;

class Solution {
    public int solution(String s) {
        s=s+s;
        int answer = 0;
        for(int i=0;i<s.length()/2;i++){
            Stack<Character> aa = new Stack<>();
            boolean a = true;
            for(int j=i;j<i+s.length()/2;j++){
                char b = s.charAt(j);
                if(b=='(' || b=='{' || b=='[') aa.push(b);
                else if(aa.empty()){
                    a=false;break;
                }
                else if(b==')'){
                    if(aa.peek()=='(') aa.pop();
                    else{
                        a=false;break;
                    }
                }
                else if(b=='}'){
                    if(aa.peek()=='{') aa.pop();
                    else{
                        a=false;break;
                    }
                }
                else if(b==']'){
                    if(aa.peek()=='[') aa.pop();
                    else{
                        a=false;break;
                    }
                }
            }
            if(aa.size()!=0) a=false;
            if(a) answer++;
        }
        return answer;
    }
}