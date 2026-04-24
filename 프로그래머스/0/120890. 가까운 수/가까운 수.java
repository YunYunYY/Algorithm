import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = -1;
        Arrays.sort(array);
        int i=0;
        for (i=0;i<array.length;i++)
            if(array[i]>n){
                if (i==0)
                answer=array[i];
                else
                    answer=n-array[i-1]<=array[i]-n ? array[i-1] : array[i];
                break;
            }
        if (answer==-1)
            return array[array.length-1];
        return answer;
    }
}