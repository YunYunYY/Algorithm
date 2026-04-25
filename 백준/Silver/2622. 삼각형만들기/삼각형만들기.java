import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int cnt=0;
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=a;j++) {
				int k = a-i-j;
				if(j>k)break;
				if(i+j>k) cnt++;
			}
		}
		System.out.println(cnt);
	}
	
}