import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //String s = bf.readLine();
        //StringTokenizer st = new StringTokenizer(s);
        
		int a = Integer.parseInt(bf.readLine());
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
	        StringTokenizer st = new StringTokenizer(s);
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int cnt=0;
			for(int j=0;j<b;j++) {
				s=bf.readLine();
				StringTokenizer st1 = new StringTokenizer(s);
				int[]aa =new int[3];
				for(int k=0;k<3;k++)
					aa[k]=Integer.parseInt(st1.nextToken());
				if(c<=(double)aa[0]*aa[1]/aa[2])cnt++;
			}
			sb.append(cnt+"\n");
			
		}
		
		System.out.print(sb);
		
		
	}
	
	
}