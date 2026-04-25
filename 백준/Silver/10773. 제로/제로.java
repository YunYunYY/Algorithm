import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			if(b==0) st.pop();
			else st.push(b);
		}
		int sum=0;
		while(!st.isEmpty())
			sum+=st.pop();
		System.out.println(sum);
	} 

}