import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int a = Integer.parseInt(s);
		if(a!=1) {
		for(int i=2;i<=Math.sqrt(a);) {
			if(a%i==0) {
				System.out.println(i);
				a/=i;
			}
			else i++;
			if(a==1) break;
		}
		if(a!=1) System.out.println(a);
		}
	}
}