import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		boolean e = false;
		for(int i=0;i<a;i++) {
			stt=new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(stt.nextToken());
			int d = Integer.parseInt(stt.nextToken());
			if(c!=d) {
				e=true;break;
			}
		}
		if(e) {
			System.out.println("Wrong Answer"); return;
		}
		e=false;
		for(int i=0;i<b;i++) {
			stt=new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(stt.nextToken());
			int d = Integer.parseInt(stt.nextToken());
			if(c!=d) {
				e=true;break;
			}
		}
		if(e) {
			System.out.println("Why Wrong!!!"); return;
		}
		System.out.println("Accepted");
	}
}