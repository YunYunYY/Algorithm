
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static int[] mem;
		// TODO Auto-generated constructor stub
	
	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			mem = new int[32];
			for(int i=0;i<32;i++) {
				String str = sc.nextLine();
				if(str.length()==0)break;
				mem[i]=bin2dec(str);
			}
			int res=proc();
			System.out.println(dec2bin(res));
			
		}
	}
	static int bin2dec(String tt) {
		int ss = 0;
		for(int i=0;i<tt.length();i++)
			ss=ss*2+(tt.charAt(i)-'0');
		return ss;
	}
	static String dec2bin(int n) {
		StringBuilder sb = new StringBuilder();
		int tdx=0;
		while(n>0) {
			sb.append(n%2);
			n/=2; tdx++;
		}
		for(int i=tdx;i<8;i++) sb.append(0);
		sb.reverse();
		return sb.toString();
	}
	static int proc() {
		int pc=0,ac=0;
		while(true) {
			int opcode=mem[pc]/32,orand=mem[pc]%32;
			switch (opcode){
			case 0 : mem[orand]=ac; pc=(pc+1)%32;break;
			case 1 : ac = mem[orand]; pc=(pc+1)%32;break;
			case 2 : if(ac==0) pc = orand; else pc=(pc+1)%32; break;
			case 3 : pc=(pc+1)%32;break;
			case 4 : ac=(ac+255)%256; pc=(pc+1)%32;break;
			case 5 : ac=(ac+1)%256; pc=(pc+1)%32; break;
			case 6 : pc=orand;break;
			case 7 : return ac;
			}
		}
	}

}