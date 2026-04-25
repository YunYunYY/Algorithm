import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer>aa = new TreeSet<Integer>();
		for(int i=1;i<=30;i++)
			aa.add(i);
		for(int i=0;i<28;i++)
			aa.remove(Integer.parseInt(bf.readLine()));
		System.out.println(aa.pollFirst());
		System.out.println(aa.pollFirst());
		
	}
}