class Solution {
    public int solution(int[] s) {
        int a = Math.max(s[0],s[1]), b=Math.min(s[0],s[1]);
        int cnt = 0;
        for(int i=1;i<a;i++){
            if (b+i>a){
                cnt++;
            }
                
        }
        for(int i=a;i<a+b;i++){
            cnt++;
        }
        return cnt;
    }
}