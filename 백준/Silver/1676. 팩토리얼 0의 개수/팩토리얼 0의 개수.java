import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int a2=0,a5=0;
		for(int i=1;i<=a;i++) {
			int j=i;
			while(j>0&&(j%2)==0) {
				j/=2;a2++;
			}
			while(j>0&&(j%5)==0) {
				j/=5;a5++;
			}
		}
		System.out.println(Math.min(a2, a5));
	}
}