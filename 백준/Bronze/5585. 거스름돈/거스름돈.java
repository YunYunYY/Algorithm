import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = 1000-Integer.parseInt(bf.readLine());
		int cnt=0;
		cnt+=a/500;a=a%500;
		cnt+=a/100;a=a%100;
		cnt+=a/50;a=a%50;
		cnt+=a/10;a=a%10;
		cnt+=a/5;a=a%5;
		cnt+=a;
		System.out.println(cnt);
	}
	   
}