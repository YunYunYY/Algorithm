import java.util.ArrayList;
class Solution {
    public int[] solution(int n, long left, long right) {
        
		int ll=(int) (left/n),lr=(int) (left%n);
		int rl=(int)(right/n),rr=(int)(right%n);
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for(int i=ll;i<=rl;i++) {
			int k=i+1;
			if(i==ll) {
				k=Math.max(lr+1, ll+1);
                if(ll==rl){
                    for(int j=lr;j<=rr;j++){
                        aa.add(k);
					    if(j+1==k)k++;
                    }
                }else{
                    for(int j=lr;j<n;j++) {
					aa.add(k);
					if(j+1==k)k++;
				}
                }
				
			}
			else if(i==rl)
				for(int j=0;j<=rr;j++){
					aa.add(k);
					if(j+1==k)k++;
				}
			else
				for(int j=0;j<n;j++) {
					aa.add(k);
					if(j+1==k)k++;
				}
		}
		int[] answer= new int[aa.size()];
		int t=0;
		for(int i:aa)
			answer[t++]=i;
		return answer;
    }
}