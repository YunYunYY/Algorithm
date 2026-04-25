import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		int a =0;
		String q="";
		for(int i=0;i<2;i++) {
			s=bf.readLine();
			if(s.compareTo("black")==0)q+=0;
			else if(s.compareTo("brown")==0)q+=1;
			else if(s.compareTo("red")==0)q+=2;
			else if(s.compareTo("orange")==0)q+=3;
			else if(s.compareTo("yellow")==0)q+=4;
			else if(s.compareTo("green")==0)q+=5;
			else if(s.compareTo("blue")==0)q+=6;
			else if(s.compareTo("violet")==0)q+=7;
			else if(s.compareTo("grey")==0)q+=8;
			else if(s.compareTo("white")==0)q+=9;
				
		}
		s=bf.readLine();
		BigInteger b = BigInteger.valueOf(Long.parseLong(q));
		if(s.compareTo("black")==0)b=b.multiply(BigInteger.ONE);
		else if(s.compareTo("brown")==0)b=b.multiply(BigInteger.valueOf(10));
		else if(s.compareTo("red")==0)b=b.multiply(BigInteger.valueOf(100));
		else if(s.compareTo("orange")==0)b=b.multiply(BigInteger.valueOf(1000));
		else if(s.compareTo("yellow")==0)b=b.multiply(BigInteger.valueOf(10000));
		else if(s.compareTo("green")==0)b=b.multiply(BigInteger.valueOf(100000));
		else if(s.compareTo("blue")==0)b=b.multiply(BigInteger.valueOf(1000000));
		else if(s.compareTo("violet")==0)b=b.multiply(BigInteger.valueOf(10000000));
		else if(s.compareTo("grey")==0)b=b.multiply(BigInteger.valueOf(100000000));
		else if(s.compareTo("white")==0)b=b.multiply(BigInteger.valueOf(1000000000));
		System.out.println(b);
	}
	   
}