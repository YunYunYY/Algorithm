import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = (a/100
				)*100;
		int d=-1;
		for(int i=0;i<100;i++) {
			if((i+c)%b==0) {
				d=(i+c)%100;
				
				break;
			}
		}
		System.out.printf("%02d",d);
	}
	   
}