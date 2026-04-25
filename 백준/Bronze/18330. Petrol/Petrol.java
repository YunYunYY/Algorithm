import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		sum += b*1500;
		if((a-b)>=60) {
			sum += 60*1500;
			sum += (a-b-60)*3000;
		}
		else
			sum += (a-b)*1500;
		System.out.println(sum);
	}

}