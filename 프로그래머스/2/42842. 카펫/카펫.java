class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int k = brown+yellow;
        for(int i=1;i<=k/2;i++){
            if(k%i==0){
                int j = k/i;
                if((i-2)*(j-2)==yellow){
                    answer[0]=j;answer[1]=i;
                    break;
                }
            }
        }
        return answer;
    }
}