import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
				aa[i]=Integer.parseInt(st.nextToken());
		
		int[] bb = new int[a];
		
		int p1=0,p2=1,ll=a-1,idx=a;
		
		for(int i=0;i<a;i++) {
			if(aa[i]==1) {
				bb[p1]=idx;
				p1=p2;p2=p2+1;
			}
				
			else if(aa[i]==2) {
				bb[p2]=idx;
				p2=p2+1;
			}
				
			else {
				bb[ll]=idx;
				ll=ll-1;
			}
			
			idx--;	
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			if(i!=a-1)
				sb.append(bb[i]+" ");
			else sb.append(bb[i]);
		}
		System.out.println(sb.toString());
	} 

}