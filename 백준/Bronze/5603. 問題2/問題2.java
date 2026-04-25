import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		for(int i=0;i<a;i++) {
			StringBuilder sb = new StringBuilder();
			int q = 1;
			char w = b.charAt(0);
			for(int j=1;j<b.length();j++) {
				if(b.charAt(j)!=w) {
					sb.append(q);
					sb.append(w);
					q=1;w=b.charAt(j);
				}
				else q++;
			}
			if(q!=0) {
				sb.append(q);
				sb.append(w);
			}
			b=sb.toString();
			//System.out.println(b);
		}
		System.out.println(b);
		
	}
}