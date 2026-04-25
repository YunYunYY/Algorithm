import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		int[][]aa=new int[a][3];
		int[]bb=new int[a];//cnt
		Arrays.fill(bb, 0);
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(st.nextToken());
			aa[i][1]=Integer.parseInt(st.nextToken());
			aa[i][2]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(aa,new Comparator<int[]>() {
			@Override
			public int compare(int[]o1,int[]o2) {
				int res=o2[2]-o1[2];
				return res;
			}
		});
		int cnt=0;
		for(int i=0;i<a;i++) {
			int q = aa[i][0];
			if(bb[q]>1)continue;
			bb[q]++;
			sb.append(aa[i][0]+" "+aa[i][1]+"\n");
			cnt++;
			if(cnt==3)break;
		}
		
		System.out.println(sb);
		
	}

}