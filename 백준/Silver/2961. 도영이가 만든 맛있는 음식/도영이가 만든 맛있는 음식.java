
import java.io.*;
import java.util.Scanner;

public class Main {
	static int N;
	static int[][] Ing;
	static long mm;
	static int[] bin;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		Ing=new int[N][2];
		for(int i=0;i<N;i++) {
			Ing[i][0]=sc.nextInt();
			Ing[i][1]=sc.nextInt();
		}
		sc.close();
		mm=Math.abs(Ing[0][0]-Ing[0][1]);
		bin = new int[N];
		Go(0);
		System.out.println(mm);
	}
	static void Check(int[] b) {
		long tt1=1;
		long tt2=0;
		int kk=0;
		for(int i=0;i<N;i++)kk+=b[i];
		if(kk==0) return;
		
		long delta=0;
		for(int i=0;i<N;i++) {
			if(b[i]==0)continue;
			tt1*=Ing[i][0];
			tt2+=Ing[i][1];
		}delta=Math.abs(tt1-tt2);
		mm=Math.min(delta, mm);
	}
	static void Go(int n) {
		if(n==N) {
			Check(bin);return;
		}
		bin[n]=0;Go(n+1);
		bin[n]=1;Go(n+1);
	}
}