import java.util.*;
class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        HashMap<Long, Set<Long>> mm = new HashMap<>();
        long maX = Long.MIN_VALUE, miX=Long.MAX_VALUE;
        long maY = Long.MIN_VALUE, miY=Long.MAX_VALUE;
        for(int i=0;i<line.length-1;i++){
            for(int j=i+1;j<line.length;j++){
                long ia=line[i][0], ib=line[i][1],ie=line[i][2];
                long jc=line[j][0], jd=line[j][1],jf=line[j][2];
                
                long d = ia*jd-ib*jc;
                if (d==0) continue;
                long x= (ib*jf-ie*jd);
                long y= (ie*jc-ia*jf);
                
                if(x%d!=0 || y%d!=0) continue;
                x=x/d;y=y/d;
                mm.computeIfAbsent(y, k -> new HashSet<>()).add(x);
                // System.out.println(y+" "+x);
                maX=Math.max(maX,x);miX=Math.min(miX,x);
                maY=Math.max(maY,y);miY=Math.min(miY,y);
                    
            }
        }
        
        // System.out.println(miX+" "+maX);
        // System.out.println(miY+" "+maY);
        
        answer = new String[(int)(maY-miY+1)];
        long j = maY;
        for(int i=0;i<answer.length;i++){
            StringBuilder sb = new StringBuilder();
            if(! mm.containsKey(j))
                for(int k = 0;k<maX-miX+1;k++)
                    sb.append(".");
    
            else{
                Set<Long> ss = mm.get(j);
                for(long k = miX;k<=maX;k++){
                    if(ss.contains(k))
                        sb.append("*");
                    else
                        sb.append(".");
                }
            }
            answer[i]=sb.toString();
            j--;
        }
        
        return answer;
    }
}