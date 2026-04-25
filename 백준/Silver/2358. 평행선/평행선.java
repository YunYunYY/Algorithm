import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[][]aa = new int[a][2];
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(st.nextToken());
			aa[i][1]=Integer.parseInt(st.nextToken());
		}
		int cnt=0;
		Arrays.sort(aa,new Comparator<int[]>(){
			@Override
			public int compare(int[]a1,int[]a2) {
				return a1[0]-a2[0];
			}
		});
		int k = aa[0][0];
		
		for(int i=0;i<a-1;i++) {
			if(k==aa[i][0]&&i!=0)continue;
			if(aa[i][0]==aa[i+1][0]) {
				k=aa[i][0];cnt++;
			}
			
				
		}
		
		Arrays.sort(aa,new Comparator<int[]>(){
			@Override
			public int compare(int[]a1,int[]a2) {
				return a1[1]-a2[1];
			}
		});
		k = aa[0][1];
		for(int i=0;i<a-1;i++) {
			if(k==aa[i][1]&&i!=0)continue;
			if(aa[i][1]==aa[i+1][1]) {
				k=aa[i][1];cnt++;
			}
				
		}
		System.out.println(cnt);
	}
	   
}