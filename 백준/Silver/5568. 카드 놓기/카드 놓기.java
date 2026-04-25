
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	static int N,K;
	static int A[];
	static HashSet<String> set;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();K=sc.nextInt();
		A = new int[N];
		int[] aa = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			aa[i]=i;
		}
		set = new HashSet<String>();
		Perm(aa, 0);
		System.out.println(set.size());
	}
	static void Perm(int[] t,int loc) {
		if(loc==K) Proc(t);
		else {
			for(int i=loc;i<N;i++) {
				int p=t[loc]; t[loc]=t[i];t[i]=p;
				Perm(t, loc+1);
				p=t[loc];t[loc]=t[i];t[i]=p;
			}
		}
	}
	static void Proc(int[] t) {
		String a ="";
		for(int i=0;i<K;i++)
			a=a+A[t[i]];
		set.add(a);
		
	}
}