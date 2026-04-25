import java.io.*;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		HashSet<String> bb = new HashSet<>();
		int cnt=0;
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			if(bb.contains(b))continue;
			else {
				cnt++;
				while(!bb.contains(b)) {
					bb.add(b);
					b=b.substring(1)+b.substring(0,1);
				}
			}
		}
		System.out.println(cnt);
	}
}