class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        String a = sb.toString();
        int answer = 0;
        for(int i=0;i<a.length();i++){
            answer*=3;
            answer+=(int)(a.charAt(i)-'0');
        }
        return answer;
    }
}