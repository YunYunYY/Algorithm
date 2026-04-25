import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        int k = 1000000;
		boolean[] sosu = new boolean[k+1];
		sosu[0]=sosu[1]=false;
		for(int i=2;i<sosu.length;i++) {
			sosu[i]=true;
		}
		for(int i=2;i*i<=k;i++)
			for(int j=i*i;j<=k;j+=i)
				sosu[j]=false;
        int[] aa = new int[k+1];
        int[] bb = new int[k+1];
        aa[0]=aa[1]=bb[0]=bb[1]=0;
        aa[2]=bb[2]=1;
        for(int i=3;i<k;i++) {
        	if(sosu[i]) {
        		aa[i]=aa[i-1]+1;
        		if(i%4==1) bb[i]=bb[i-1]+1;
        		else bb[i]=bb[i-1];
        	}
        	else {
        		aa[i]=aa[i-1];bb[i]=bb[i-1];
        	}
        }
		while(true) {
			String s = bf.readLine();
	        StringTokenizer st = new StringTokenizer(s);
	        int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==-1&&b==-1) break;
			
			if(b<=1) {
				sb.append(a+" "+b+" "+"0 0\n");
			}
			else if(a<=0)
				sb.append(a+" "+b+" "+aa[b]+" "+bb[b]+"\n");
			else
				sb.append(a+" "+b+" "+(aa[b]-aa[a-1])+" "+(bb[b]-bb[a-1])+"\n");
		}
		
		System.out.print(sb);
		
		
	}
	
	
}