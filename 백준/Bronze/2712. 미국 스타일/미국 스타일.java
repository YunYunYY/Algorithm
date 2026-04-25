import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			double b = Double.parseDouble(stt.nextToken());
			String c = stt.nextToken();
			if(c.compareTo("kg")==0)
				sb.append(String.format("%.4f lb\n",b*2.2046 ));
			else if(c.compareTo("lb")==0)
				sb.append(String.format("%.4f kg\n", b*0.4536));
			else if(c.compareTo("l")==0)
				sb.append(String.format("%.4f g\n", b*0.2642));
			else sb.append(String.format("%.4f l\n", b*3.7854));
		}
		System.out.println(sb);
	}
	
}