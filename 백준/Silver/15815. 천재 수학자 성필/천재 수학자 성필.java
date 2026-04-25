import java.util.*;

public class Main {
	static boolean IsDigit(char cc) {
		if (cc >='0' && cc <='9') return true;
		else return false;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		sc.close();
		
		Stack<Integer> st = new Stack<Integer> ();
		for (int i=0; i<expr.length(); i++) {
		char ch = expr.charAt(i);
		if (IsDigit(ch)==true) {
		st.push((int) (ch-'0'));
		//System.out.println(ch-'0');
		}
		else {
		int n1 = st.pop(), n2 = st.pop();
		switch(ch) {
			case '+': st.push(n1+n2);break;
			case '-': st.push(n2-n1);break;
			case '*': st.push(n1*n2);break;
			case '/': st.push(n2/n1);break;
					}
			}
		}
		System.out.println(st.pop());
	}

}