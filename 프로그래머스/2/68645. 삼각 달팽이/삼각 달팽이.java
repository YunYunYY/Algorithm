import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] aa = new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(aa[i],-1);
        
        int i=0,j=0, sn=1;
        
        while(true){
            while(true){
                aa[i][j]=sn++;
                if(i==n-1||aa[i+1][j]!=-1) break;
                i++;
            }            
            if(j==n-1||aa[i][j+1]!=-1) break;
            j++;
            
            
            while(true){
                aa[i][j]=sn++;
                if(j==n-1||aa[i][j+1]!=-1) break;
                j++;
            }
            if(aa[i-1][j-1]!=-1) break;
            j--;i--;
            
            
            while(true){
                aa[i][j]=sn++;
                if(aa[i-1][j-1]!=-1) break;
                i--;j--;
            }
            if(i==n-1||aa[i+1][j]!=-1) break;
            i++;
        }
        
        
        
        int idx=0;
        for(int k = 0;k<n;k++)
            for(int l = 0;l<=k;l++)
                answer[idx++]=aa[k][l];
        
        return answer;
    }
}