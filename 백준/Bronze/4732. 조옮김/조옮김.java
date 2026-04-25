import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] aa = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
		while (true) {
			String a = bf.readLine();
			if(a.charAt(0)=='*')break;
			int b = Integer.parseInt(bf.readLine());
			StringTokenizer stt = new StringTokenizer(a);
			while (stt.hasMoreTokens()) {
				String c = stt.nextToken();
				if(c.length()==2&&c.charAt(1)=='b') {
					if(c.charAt(0)=='C')c="B";
					else if(c.charAt(0)=='F')c="E";
					else if(c.charAt(0)=='A')c="G#";
					else {
						c=(char)(c.charAt(0)-1)+"#";
					}
				}
				if(c.length()==2&&c.charAt(1)=='#') {
					if(c.charAt(0)=='B')c="C";
					else if (c.charAt(0)=='E')c="F";
				}
				int i=0;
				for(i=0;i<aa.length;i++)
					if(c.compareTo(aa[i])==0)break;
				if(b<0) sb.append(aa[(i+b+12)%12]+" ");
				else sb.append(aa[(i+b)%12]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}