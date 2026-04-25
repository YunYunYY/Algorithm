import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a =Integer.parseInt(st.nextToken());
		
		for(int i=0;i<a;i++) {
			s = bf.readLine();
			st=new StringTokenizer(s);
			int[] aa = new int[3];
			for(int j=0;j<3;j++)
				aa[j]=Integer.parseInt(st.nextToken());
			Arrays.sort(aa);
			if(aa[0]*aa[0]+aa[1]*aa[1]==aa[2]*aa[2]) {
				if(aa[2]>=aa[0]+aa[1])
					System.out.println("Scenario #"+(i+1)+":"+"\nno");
				else
					System.out.println("Scenario #"+(i+1)+":"+"\nyes");
			}
			else
				System.out.println("Scenario #"+(i+1)+":"+"\nno");
			if(i!=a-1)
				System.out.println();
			
		}
		
		
		
	} 

}