import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			long[] aa = new long[4];
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int i=0;i<aa.length;i++)
				aa[i]=Integer.parseInt(stt.nextToken());
			if(aa[0]==-1)break;
			long a = (aa[1]-1)*aa[1]/2*aa[0];
			long b = aa[0]*aa[2]+aa[3];
			long c =(long) (Math.log(b)/Math.log(2));
			if(Math.pow(2, c)!=b) {
				a+=Math.pow(2, c+1)-1;
				sb.append(aa[0]+"*"+aa[2]+"/"+aa[1]+"+"+aa[3]+"="+a+"+"+(long)(Math.pow(2, c+1)-b)+"\n");
			}
			else sb.append(aa[0]+"*"+aa[2]+"/"+aa[1]+"+"+aa[3]+"="+(a+b-1)+"+0\n");
		}
		System.out.println(sb);
	}
}