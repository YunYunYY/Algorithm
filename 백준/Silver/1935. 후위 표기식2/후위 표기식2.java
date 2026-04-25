import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		String s=bf.readLine();
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine());
		Stack<Double> st = new Stack<Double> ();
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				double b = aa[ch-'A'];
				st.push(b);
			}
		else {
		double n1 = st.pop(), n2 = st.pop();
		switch(ch) {
			case '+': st.push(n1+n2);break;
			case '-': st.push(n2-n1);break;
			case '*': st.push(n1*n2);break;
			case '/': st.push(n2/n1);break;
					}
			}
		}
		System.out.println(String.format("%.2f", st.pop()));
	}

}