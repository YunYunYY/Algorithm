import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		double a = Integer.parseInt(stt.nextToken());
		double b = Integer.parseInt(stt.nextToken());
		double x = 0,y = 0;
		if(a==0&&b==0) {
			x=125;y=125;
		}
		else if(a==0&&b>=125) {
			x=15625/b*2;y=0;
		}
		else if(a==0&&b<125) {
			x=15625/(250-b)*2;
			y=-x+250;
		}
		else if(b==0&&a>=125) {
			y=15625/a*2;x=0;
		}
		else if(b==0&&a<125) {
			y=15625/(250-a)*2;
			x=-y+250;
		}
		else if(a!=0&&b!=0) {
			if(a<=125) {
				x=250-15625/b*2;
				y=0;
			}
			else {
				y=250-15625/a*2;
				x=0;
			}
		}
		System.out.println(String.format("%.2f", x)+" "+String.format("%.2f", y));
	}
}