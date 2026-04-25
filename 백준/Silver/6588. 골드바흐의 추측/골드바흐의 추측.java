import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //String s = bf.readLine();
        //StringTokenizer st = new StringTokenizer(s);
        
		int k = 1000000;
		boolean[] sosu = new boolean[k+1];
		sosu[0]=sosu[1]=false;
		for(int i=2;i<sosu.length;i++)
			sosu[i]=true;
		for(int i=2;i*i<=k;i++)
			for(int j=i*i;j<=k;j+=i)
				sosu[j]=false;
		
		int a = Integer.parseInt(bf.readLine());
		while(a!=0) {
			int b,c;
			boolean d = false;
			for(int i=3;i<a;i++) 
				if(sosu[a-i]&&sosu[i]) {
					sb.append(a+" = "+i+" + "+(a-i)+"\n");
					d=true;break;
				}
			if(!d) sb.append("Goldbach's conjecture is wrong.\n");
			a=Integer.parseInt(bf.readLine());
		}
		System.out.println(sb);
	}
	
	
}