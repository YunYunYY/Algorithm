import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean b = true;
		for(int i=0;i<5;i++) {
			String a = bf.readLine();
			if(a.contains("FBI")) {
				if(b) {
					sb.append(i+1);b=false;
				}
				else sb.append(" "+(i+1));
			}
		}
		if(b) sb.append("HE GOT AWAY!");
		System.out.println(sb);
	}
}