import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int cnt=0;
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			String b = stt.nextToken();
			int c = Integer.parseInt(stt.nextToken());
			int d = Integer.parseInt(b.substring(0, 2));
			int e = Integer.parseInt(b.substring(3));
			
			if(d>=19||d<=5) cnt+=(c*5);
			else if(d>=7&&d<18) cnt+=(c*10);
			else if(d==6) {
				if(e+c<60) cnt+=(c*5);
				else {
					cnt+=(c+e-60)*10;
					cnt+=(60-e)*5;
				}
			}
			else if(d==18){
				if(e+c<60) cnt+=(c*10);
				else {
					cnt+=(c+e-60)*5;
					cnt+=(60-e)*10;
				}
			}
		}
		System.out.println(cnt);
	}
}