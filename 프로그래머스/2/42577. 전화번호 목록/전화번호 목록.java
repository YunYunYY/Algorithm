import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) { 
        HashSet<String> aa = new HashSet<>();
        for(String s : phone_book){
            for(int i=1;i<s.length();i++)
                aa.add(s.substring(0,i));
        }
        for(String s: phone_book){
            if(aa.contains(s)) return false;
        }
        return true;
    }
}