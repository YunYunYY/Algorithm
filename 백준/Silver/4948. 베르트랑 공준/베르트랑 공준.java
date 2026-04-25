import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		//체
		int k = 123456*2;
		boolean[] sosu = new boolean[k+1];
		sosu[0]=sosu[1]=false;
		for(int i=2;i<sosu.length;i++)
			sosu[i]=true;
		for(int i=2;i*i<=k;i++)
			for(int j=i*i;j<=k;j+=i)
				sosu[j]=false;
		
		int a = Integer.parseInt(bf.readLine());
        while(a!=0) {
        	int b = 2*a;
        	int cnt=0;
        	for(int i=a+1;i<b+1;i++)
        		if(sosu[i])cnt++;
        	sb.append(cnt+"\n");
        	a = Integer.parseInt(bf.readLine());
        }
        System.out.println(sb);
		
	}
	
	
}