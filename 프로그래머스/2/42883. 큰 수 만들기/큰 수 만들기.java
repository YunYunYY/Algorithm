import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        for(char i : number.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek() < i){
                stack.pop();k--;
            }
            stack.push(i);
        }
        while(k>0){
            stack.pop();k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}