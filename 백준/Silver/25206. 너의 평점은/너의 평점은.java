import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double b = 0.0;
		Map<String, Double> aa= new HashMap<>();
		aa.put("A+", 4.5);aa.put("A0", 4.0);
		aa.put("B+", 3.5);aa.put("B0", 3.0);
		aa.put("C+", 2.5);aa.put("C0", 2.0);
		aa.put("D+", 1.5);aa.put("D0", 1.0);
		aa.put("F", 0.0);
		for(int i=0;i<20;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			stt.nextToken();
			int a1 = (int)Double.parseDouble(stt.nextToken())*10;
			String b1=stt.nextToken();
			if(b1.compareTo("P")==0)continue;
			a+=a1;
			b+=a1*aa.get(b1);
		}
		System.out.println(b/a);
	}
}