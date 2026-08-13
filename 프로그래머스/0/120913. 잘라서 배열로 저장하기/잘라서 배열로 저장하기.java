class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()-1)/n+1];
        int i;
        for(i=0;i<answer.length-1;i++)
            answer[i]=my_str.substring(i*n,i*n+n);
        answer[i]=my_str.substring(i*n);
        return answer;
    }
}