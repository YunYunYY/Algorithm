class Solution {
    public int solution(int n) {
        int i = 1;
        int k = 1;
        while(true){
            k*=i;
            if(k>=n+1){
                i--;
                break;
            }
            i++;
            
        }
        return i;
    }
}