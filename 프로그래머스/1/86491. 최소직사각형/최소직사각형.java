import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int a = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=a;
            }
        }
        Arrays.sort(sizes, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o2[0]-o1[0];
            }
        });
        int answer = sizes[0][0];
       
        Arrays.sort(sizes, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o2[1]-o1[1];
            }
        });
        
        return answer*sizes[0][1];
    }
}