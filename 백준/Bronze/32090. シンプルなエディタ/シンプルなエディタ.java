import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0)break;
			StringBuilder sb = new StringBuilder();
			int index=0;
			for(int i=0;i<a;i++) {
				StringTokenizer stt = new StringTokenizer(bf.readLine());
				String s = stt.nextToken();
				switch (s) {
				case "INSERT": 
					String c =stt.nextToken();
					String d =sb.toString();
					sb=new StringBuilder();
					sb.append(d.substring(0,index));
					sb.append(c);
					sb.append(d.substring(index));
					index++;
					break;
				case "LEFT":
					if (index>0)index--;
					break;
				case "RIGHT":
					if (index<sb.toString().length())index++;
					break;
				}
			}
			System.out.println(sb.toString());
		}
	}
	
}