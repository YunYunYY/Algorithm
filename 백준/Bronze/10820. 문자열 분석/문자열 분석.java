import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while((s=bf.readLine())!=null) {
			int[] aa = new int[4];
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='a'&&s.charAt(i)<='z')
					aa[0]++;
				else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
					aa[1]++;
				else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
					aa[2]++;
				else
					aa[3]++;
			}
			System.out.println(aa[0]+" "+aa[1]+" "+aa[2]+" "+aa[3]);
		}
	}
	
}