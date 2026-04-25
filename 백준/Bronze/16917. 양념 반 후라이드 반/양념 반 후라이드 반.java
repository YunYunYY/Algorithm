import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		int c =Integer.parseInt(st.nextToken());
		int x =Integer.parseInt(st.nextToken());
		int y =Integer.parseInt(st.nextToken());
		
		
		int money = a*x+b*y;
		int cnt=0;
		if(a+b>c*2) {
			while(true) {
				x-=1;y-=1;cnt+=2;
				if(x<0&&y<0)break;
				if(x<0)x=0;
				if(y<0)y=0;
				int sum=a*x+b*y+c*cnt;
				if(sum<money) money=sum;
			}
			
		}
		System.out.println(money);
	} 

}