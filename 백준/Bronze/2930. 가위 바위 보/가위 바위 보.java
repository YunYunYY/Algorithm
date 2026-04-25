import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		int c = Integer.parseInt(bf.readLine());
		String[] aa = new String[c];
		int[][] bb = new int[a][3];
		for(int i=0;i<c;i++)
			aa[i]=bf.readLine();
		for(int i=0;i<c;i++)
			for(int j=0;j<a;j++) { //0>1>2>0
				if(aa[i].charAt(j)=='S') bb[j][0]++;
				else if(aa[i].charAt(j)=='P')bb[j][1]++;
				else bb[j][2]++;
			}
		int sco = 0,sco1=0;
		for(int i=0;i<a;i++) {
			if(b.charAt(i)=='S') {
				sco+=bb[i][0];sco+=bb[i][1]*2;
			}
			else if(b.charAt(i)=='P') {
				sco+=bb[i][1];sco+=bb[i][2]*2;
			}
			else {
				sco+=bb[i][2];sco+=bb[i][0]*2;
			}
		}
		for(int i=0;i<a;i++) {
			int max=0;
			max=Math.max(bb[i][0]+bb[i][1]*2, bb[i][1]+bb[i][2]*2);
			max=Math.max(bb[i][2]+bb[i][0]*2, max);
			sco1+=max;
		}
		System.out.println(sco);
		System.out.println(sco1);
		
	}
}