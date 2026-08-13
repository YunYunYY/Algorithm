class Solution {
    static int L=0,R=1;
static int[][] aa = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,2}};
    public String solution(int[] numbers, String hand) {
   String answer = "";
		int nl=10,nr=11;
		int h=-1;
		if(hand.equals("left"))h=L;
		else h=R;
		//System.out.println("H:"+h);
		
		for(int i=0;i<numbers.length;i++) {
			int ll = qqq(nl, numbers[i]);
			int rr = qqq(nr, numbers[i]);
			if(aa[numbers[i]][1]==0) {
				answer+="L"; nl=numbers[i];
			}
			else if(aa[numbers[i]][1]==2) {
				answer+="R"; nr=numbers[i];
			}
			else {
				if(ll<rr) {
					answer+="L"; nl=numbers[i];
				}
				else if(rr<ll) {
					answer+="R"; nr=numbers[i];
				}
				else {
					if(h==L) {
						answer+="L"; nl=numbers[i];
					}
					else {
						answer+="R"; nr=numbers[i];
					}
				}
			}
		}
		
        return answer;
	}
	static int qqq(int a,int b) {
		return (Math.abs(aa[a][0]-aa[b][0])+Math.abs(aa[a][1]-aa[b][1]));
	}
}