import java.util.*;
class Solution {
    public long solution(String expression) {
        long answer = 0;
        StringTokenizer st = new StringTokenizer(expression,"+-*",true);
        List<String> aa = new ArrayList<>();
        while(st.hasMoreTokens()){
            aa.add(st.nextToken());
        }
        String[][] bb = {"+-*".split(""),"+*-".split(""),"-*+".split(""),
                        "*-+".split(""),"*+-".split(""),"-+*".split("")};
        
        for(int i=0;i<6;i++){
            answer=Math.max(Math.abs(aaa(new ArrayList<>(aa),bb[i])),answer);
        }
        
        return answer;
    }
    static long aaa(List<String> tt, String[] pp){
        for(String p : pp){
            for(int i=0;i<tt.size();i++){
                if(tt.get(i).equals(p)){
                    long a = Long.parseLong(tt.get(i-1));
                    long b = Long.parseLong(tt.get(i+1));
                    long r = cal(a,b,tt.get(i));
                    
                    tt.remove(i-1);tt.remove(i-1);tt.remove(i-1);
                    tt.add(i-1,String.valueOf(r));
                    i-=2;
                }
            }
        }
        return Long.parseLong(tt.get(0));
    }
    
    
    static long cal(long a, long b, String c){
        switch(c){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
        }
        return -1;
    }
}