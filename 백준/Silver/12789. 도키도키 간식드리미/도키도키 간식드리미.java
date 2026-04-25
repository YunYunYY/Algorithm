import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Stack<Integer>st=new Stack<>();
		Queue<Integer>qw=new LinkedList<>();
		for(int i=0;i<a;i++)
			qw.add(sc.nextInt());
		int cnt=1;
		while(!qw.isEmpty()) {
			if(qw.peek()==cnt) {
				qw.remove();cnt++;
			}
			if(!st.isEmpty()&&st.peek()==cnt) {
				st.pop();cnt++;
			}
			else 
				if(!qw.isEmpty())
					st.push(qw.remove());
		}
		while(!st.isEmpty()) {
			if(st.peek()==cnt) {
				st.pop();cnt++;
			}
			else {
				System.out.println("Sad");return;
			}
		}
		//if(st.isEmpty())
			System.out.println("Nice");
		
	}
	
}