import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b="";
			int c=0,d=0;
			while(true) {
				b=bf.readLine();
				if(b.isBlank())break;
				for(int j=0;j<b.length();j++)
					if(b.charAt(j)=='#')c++;
				d+=b.length();
				//System.out.println(b);
			}
			double e = (double)(d-c)/d*100;
			e=Math.round(e*10)/10.0;
			if((int)e==e)System.out.println("Efficiency ratio is "+(int)e+"%.");
			else System.out.println("Efficiency ratio is "+e+"%.");
		}
	}
}