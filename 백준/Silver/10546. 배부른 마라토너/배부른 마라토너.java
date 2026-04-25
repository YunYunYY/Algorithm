import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		HashSet<String> aa = new HashSet<>();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			if(aa.contains(b)) aa.remove(b);
			else aa.add(b);
		}
		for(int i=0;i<a-1;i++) {
			String b = bf.readLine();
			if(!aa.contains(b))aa.add(b);
			else aa.remove(b);
		}
		Iterator c = aa.iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
	}
}