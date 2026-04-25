import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double a =1;
		double[] aa = new double[10];
		aa[0]=1;aa[1]=1;
		for(int i=2;i<=9;i++)
			aa[i]=aa[i-1]/i;
		sb.append("n e\n");
		sb.append("- -----------\n");
		sb.append(String.format("0 %.0f\n", a));
		a+=aa[1];
		sb.append(String.format("1 %.0f\n", a));
		a+=aa[2];
		sb.append(String.format("2 %.1f\n", a));
		for(int i=3;i<=9;i++) {
			a+=aa[i];
			sb.append(String.format(i+" %.9f\n", a));
			
		}
		System.out.println(sb);
	}
	
}