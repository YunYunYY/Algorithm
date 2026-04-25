import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String s;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int cnt=0;
			while(true) {
				if(c-a==2)break;
				if(c-b>b-a) {
					a=b;b=c-1;cnt++;
				}
				else {
					c=b;b=a+1;cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
	   
}