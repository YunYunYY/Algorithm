import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String string = "";
		while((string=bf.readLine())!=null) {
			int a = Integer.parseInt(string);
			HashSet<Integer> aa = new HashSet<Integer>();
			int i = 1;
			while(true) {
				long r = (long)i*a;
				while(r>0) {
					aa.add((int) (r%10));r/=10;
				}
				if(aa.size()==10)break;
				i++;
			}
			System.out.println(i);
		}
	}
}