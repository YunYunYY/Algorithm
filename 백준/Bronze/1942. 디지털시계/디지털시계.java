import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			String a = st.nextToken().replace(":", "");
			String b = st.nextToken().replace(":", "");
			
			int[]aa=new int[3],bb=new int[3];
			for(int j=0;j<3;j++)
				aa[j]=Integer.parseInt(a.substring(j*2,(j+1)*2));
			for(int j=0;j<3;j++)
				bb[j]=Integer.parseInt(b.substring(j*2,(j+1)*2));
			int cnt=0;
			if(Integer.parseInt(a)%3==0)cnt++;
			while(true) {
				if(aa[0]==bb[0]&&aa[1]==bb[1]&&aa[2]==bb[2]) break;
				aa[2]++;
				if(aa[2]>=60) {
					aa[2]=0;aa[1]++;
				}
				if(aa[1]>=60) {
					aa[1]=0;aa[0]++;
				}
				if(aa[0]>=24)
					aa[0]=0;
				int c = aa[0]*10000+aa[1]*100+aa[2];
				if(c%3==0)cnt++;
			}
			sb.append(cnt+"\n");

		}
		System.out.println(sb);
	}

}