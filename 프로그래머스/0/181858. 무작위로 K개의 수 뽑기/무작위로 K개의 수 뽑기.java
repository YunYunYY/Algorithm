class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        boolean[] aa = new boolean[100001];
        int c = 0;
        for(int i : arr){
            if(aa[i]) continue;
            aa[i]=true;
            answer[c]=i;
            c++;
            if(c>=k) break;
        }
        for(int i=c;i<k;i++)
            answer[i]=-1;
        return answer;
    }
}