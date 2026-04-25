import java.io.*;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = bf.readLine();
		while(a.compareTo("*")!=0) {
			boolean c = false;
			for(int i=1;i<a.length();i++) {
				HashSet<String>aa = new HashSet<>();
				if(c) break;
				for(int j=0;j<a.length()-i;j++) {
					if(c)break;
					String b = a.substring(j,j+1)+a.substring(i+j,i+j+1);
					if(aa.contains(b)) c=true;
					aa.add(b);
				}
					
			}
			if(c) sb.append(a+" is NOT surprising.\n");
			else sb.append(a+" is surprising.\n");
			
			a=bf.readLine();
		}
		
		System.out.println(sb);
	}
}