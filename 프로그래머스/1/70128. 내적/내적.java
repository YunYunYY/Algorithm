class Solution {
    public int solution(int[] a, int[] b) {
        long k = 0;
        for(int i=0;i<a.length;i++)
            k+=a[i]*b[i];
        return (int)k;
    }
}