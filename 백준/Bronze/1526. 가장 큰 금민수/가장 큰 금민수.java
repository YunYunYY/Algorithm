import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int j=a;j>=4;j--) {
			int k=j;
			boolean b = true;
			while(k!=0) {
				int q = k%10;
				if(q!=4&&q!=7) {
					b=false;break;
				}
				k/=10;
			}
			if(b) {
				System.out.println(j);break;
			}
		}
		
	}
	
}