class Solution {
    public String solution(int a, int b) {
        String[] w = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] d = {0,31,29,31,30,31,30,31,31,30,31,30};
        for(int i=1;i<d.length;i++)
            d[i]=d[i]+d[i-1];
        int dd = d[a-1]+b;
        return w[dd%7];
    }
}