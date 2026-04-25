import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		for(int j=1000;j<10000;j++) {
			int aa = j;
			int a = 0;
			while(aa>0) {
				a+=aa%10;aa/=10;
			}
			String bb = Integer.toHexString(j);
			int b = 0;
			for(int i=0;i<bb.length();i++) {
				if(bb.charAt(i)>='a') {
					int q = bb.charAt(i)-'a'+10;
					b+=q;
				}
				else b+=(int)(bb.charAt(i)-'0');
			}
			String cc = Integer.toString(j, 12);
			int c = 0;
			for(int i=0;i<cc.length();i++) {
				if(cc.charAt(i)>='a') {
					int q = cc.charAt(i)-'a'+10;
					c+=q;
				}
				else c+=(int)(cc.charAt(i)-'0');
			}
			if(a==b&&c==b)sb.append(j+"\n");
		}
		System.out.println(sb);
		
	}
	
}