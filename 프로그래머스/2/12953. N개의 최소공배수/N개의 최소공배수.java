import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int t = arr[0];
        while(true){
            boolean p = true;
            for(int i=0;i<arr.length;i++)
                if(arr[i]%t!=0) p=false;
            if (p) break;
            t--;
        }
        answer=t;
        while(true){
            boolean p = true;
            for(int i=0;i<arr.length;i++)
                if(answer%arr[i]!=0) p=false;
            if (p) break;
            answer+=t;
        }
        return answer;
    }
}