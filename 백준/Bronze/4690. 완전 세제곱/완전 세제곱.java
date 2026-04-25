import java.util.*;
public class Main {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		for(int a=2;a<=100;a++) {
			for(int b=2;b<69;b++)
				for(int c=b+1;c<79;c++)
					for(int d=c+1;d<99;d++) {
						if(a*a*a==b*b*b+c*c*c+d*d*d)
							System.out.println("Cube = "+a+", Triple = ("+b+","+c+","+d+")");
						else if(a*a*a<b*b*b+c*c*c+d*d*d) break;
					}
		}
	} 

}