class Solution {
    public int solution(String d) {
        int[] aa = new int[3];
		int[] bb = new int[3];
		int[] cc = new int[3];
		
		int p = 0;
		for(int i=0;i<3;i++) {
			if(d.charAt(p)=='1'&&d.charAt(p+1)=='0') {
				aa[i]=10;
				p=p+2;
			}
			else {
				aa[i]=d.charAt(p)-'0';
				p++;
			}
			
			if(d.charAt(p)=='S') bb[i]=1;
			else if(d.charAt(p)=='D') bb[i]=2;
			else bb[i]=3;
			p++;
			
			if(p==d.length()) break;
			if(d.charAt(p)=='*') {
				cc[i]=1; p++;
			}
			else if(d.charAt(p)=='#') {
				cc[i]=2; p++;
			}
		}
		
		int[] sum = new int[3];
		sum[0]=0;sum[1]=0;sum[2]=0;
		
		for(int i=0;i<3;i++) {
			sum[i]=(int)Math.pow(aa[i], bb[i]);
			if(cc[i]==1) {
				sum[i]=sum[i]*2;
				if(i>0)
					sum[i-1]=sum[i-1]*2;
			}
			else if(cc[i]==2) {
				sum[i]=-sum[i];
			}
		}
		
		//System.out.println(sum[0]+sum[1]+sum[2]);
        return sum[0]+sum[1]+sum[2];
    }
}