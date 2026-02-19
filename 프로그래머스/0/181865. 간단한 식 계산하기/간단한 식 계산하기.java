import java.util.StringTokenizer;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        StringTokenizer stt = new StringTokenizer(binomial);
        int a = Integer.parseInt(stt.nextToken());
        String c = stt.nextToken();
        int b = Integer.parseInt(stt.nextToken());
        switch(c){
            case "+":
                return a+b;
            case "-":
                return a-b;
            default:
                return a*b;
        }
    }
}