
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		int[] bb = new int[b];
		for(int i=0;i<a;i++) {
			int max=-999,q=-1;
			for(int j=0;j<b;j++){
				if(bb[j]-aa[i]>0)continue;
				else if(max<bb[j]-aa[i]) {
					max=bb[j]-aa[i];q=j;
				}
				
			}
			if(max==-999) {
				System.out.println("NO");return;
			}
			else bb[q]=aa[i];
		}
		System.out.println("YES");
		
	}
	

}