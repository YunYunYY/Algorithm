class Solution {
    public int solution(int n) {
        int cnt = count(n);
        //System.out.println(cnt);
        while(true){
            int a = count(++n);
            if(a==cnt) break;
        }
        return n;
    }
    static int count(int a){
        int cnt = 0;
        while(a>0){
            a&=a-1;
            cnt++;
        }
        return cnt;
    }
}