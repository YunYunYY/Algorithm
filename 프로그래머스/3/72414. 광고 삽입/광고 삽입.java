import java.util.StringTokenizer;
class Solution {
    public String solution(String pt, String at, String[] log) {
        int p = tt(pt);int a = tt(at);
		int[]aa = new int[p+1];
		for(int i=0;i<log.length;i++) {
			StringTokenizer stt = new StringTokenizer(log[i],"-");
			int w = tt(stt.nextToken());
			int e = tt(stt.nextToken());
			for(int j=w;j<e;j++)
				aa[j]++;
		}
		long sum=0;
		int n=0;
		for(int i=0;i<a;i++) sum+=aa[i];
        long max=sum;
		for(int i=0,j=i+a;j<p;j++,i++) {
			sum-=aa[i];sum+=aa[j];
			if(sum>max) {
				max=sum;n=i+1;
			}
			
		}
        
		//System.out.println(n);
		String ans="";
		ans+=String.format("%02d", n/3600);n%=3600;
		ans+=":";
		ans+=String.format("%02d", n/60);n%=60;
		ans+=":";
		ans+=String.format("%02d", n);
		return ans;
	}
	static int tt (String a) {
		int q = Integer.parseInt(a.substring(0,2))*3600
				+Integer.parseInt(a.substring(3,5))*60
				+Integer.parseInt(a.substring(6,8));
		return q;
	}
}