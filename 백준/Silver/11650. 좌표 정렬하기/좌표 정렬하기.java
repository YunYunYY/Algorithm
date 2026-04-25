import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		int[][]aa=new int[a][2];
		
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(st.nextToken());
			aa[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(aa,new Comparator<int[]>() {
			@Override
			public int compare(int[]o1,int[]o2) {
				int res=o1[0]-o2[0];
				if(res==0) return o1[1]-o2[1];
				else return res;
			}
		});
		for(int i=0;i<a;i++)
			sb.append(aa[i][0]+" "+aa[i][1]+"\n");
		System.out.println(sb);
		
	}

}