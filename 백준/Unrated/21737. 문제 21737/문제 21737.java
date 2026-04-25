import java.util.Scanner;

public class Main {
	static String E;
	static int N;
	static int[] IntTok(int loc) {
		int[] r = new int[2];
		int ss = 0;
		if (loc ==N) {
			r[0] = -1;
			return r;
		}
		while (loc <E.length() && E.charAt(loc) <='9') {
			ss = ss*10 + (E.charAt(loc) - '0');
			loc++;
		}
		r[0] = ss;
		r[1] = loc;
		return r;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.next();
		E = sc.next();
		sc.close();
		
		N = E.length();
		int[] r= IntTok(0);
//		System.out.println(r[0] +" "+r[1]);
		int loc = r[1];
		int ss = r[0];

		StringBuilder sb = new StringBuilder();
		while (loc < N) {
			if (E.charAt(loc) == 'C') {
				sb.append(ss+" "); loc++;
			}
			else {
				r = IntTok(loc+1);
				if (r[0] == -1) break;
				switch (E.charAt(loc)) {
					case 'S': ss= ss -r[0]; break;
					case 'M': ss= ss *r[0]; break;
					case 'U': ss= ss /r[0]; break;
					case 'P': ss= ss +r[0]; break;
				}
//				System.out.println(ss);
				loc = r[1];
			}
		}
		if (sb.length()==0)
			System.out.println("NO OUTPUT");
		else
			System.out.println(sb.toString());
	}
}