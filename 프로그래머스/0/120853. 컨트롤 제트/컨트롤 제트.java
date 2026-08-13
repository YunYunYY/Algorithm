import java.util.StringTokenizer;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer stt = new StringTokenizer(s);
        int i = -1;
        while(stt.hasMoreTokens()){
            String a = stt.nextToken();
            if(a.compareTo("Z")==0)
                answer-=i;
            else{
                i=Integer.parseInt(a);
                answer+=i;
            }
        }
        return answer;
    }
}