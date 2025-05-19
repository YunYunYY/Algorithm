import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		System.out.print("LoveisKoreaUniversity");
		for(int i=0;i<a-1;i++)
			System.out.print(" LoveisKoreaUniversity");
	}

}