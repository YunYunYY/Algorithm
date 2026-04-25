import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt=0;
		for(int i=0;i<8;i++) {
			String s = bf.readLine();
			for(int j=0;j<8;j++) {
				if((i+j)%2==0&&s.charAt(j)=='F')cnt++;
			}
		}
		System.out.println(cnt);
	}
	   
}