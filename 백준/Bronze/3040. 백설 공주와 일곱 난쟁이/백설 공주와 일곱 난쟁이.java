import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] aa = new int[9];
		int a = 0;
		for(int i=0;i<9;i++) {
			aa[i]=Integer.parseInt(bf.readLine());
			a+=aa[i];
		}
		a-=100;
		int ii=-1,jj=-1;
		for(int i=0;i<8;i++)
			for(int j=i+1;j<9;j++)
				if(aa[i]+aa[j]==a) {
					ii=i;jj=j;
				}
		for(int q=0;q<9;q++)
			if(q!=ii&&q!=jj)
				System.out.println(aa[q]);
		
	}
}