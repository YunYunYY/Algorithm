import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		String a = stt.nextToken();
		String b = stt.nextToken();
		int c = Integer.parseInt(stt.nextToken());
		int ar=a.charAt(0)-'A';
		int ac=a.charAt(1)-'0'-1;
		int cr=b.charAt(0)-'A';
		int cc=b.charAt(1)-'0'-1;
		
		for(int i=0;i<c;i++) {
			String d = bf.readLine();
			switch (d) {
			case "R": {
				ar++;
				if(ar>7) {
					ar--;continue;
				}
				if(ar==cr&&ac==cc)
					cr++;
				if(cr>7) {
					ar--;cr--;continue;
				}
				break;
			}
			
			case "L": {
				ar--;
				if(ar<0) {
					ar++;continue;
				}
				if(ar==cr&&ac==cc)
					cr--;
				if(cr<0) {
					ar++;cr++;continue;
				}
				break;
			}
			case "B": {
				ac--;
				if(ac<0) {
					ac++;continue;
				}
				if(ar==cr&&ac==cc)
					cc--;
				if(cc<0) {
					ac++;cc++;continue;
				}
				break;
			}
			case "T": {
				ac++;
				if(ac>7) {
					ac--;continue;
				}
				if(ar==cr&&ac==cc)
					cc++;
				if(cc>7) {
					ac--;cc--;continue;
				}
				break;
			}
			case "RT":{
				ar++;ac++;
				if(ar>7||ac>7) {
					ar--;ac--;continue;
				}
				if(ar==cr&&ac==cc) {
					cr++;cc++;
				}
				if(cr>7||cc>7) {
					ar--;ac--;cr--;cc--;continue;
				}
				break;
			}
			case "LT":{
				ar--;ac++;
				if(ar<0||ac>7) {
					ar++;ac--;continue;
				}
				if(ar==cr&&ac==cc) {
					cr--;cc++;
				}
				if(cr<0||cc>7) {
					ar++;ac--;cr++;cc--;continue;
				}
				break;
			}case "RB":{
				ar++;ac--;
				if(ar>7||ac<0) {
					ar--;ac++;continue;
				}
				if(ar==cr&&ac==cc) {
					cr++;cc--;
				}
				if(cr>7||cc<0) {
					ar--;ac++;cr--;cc++;continue;
				}
				break;
			}
			case "LB":{
				ar--;ac--;
				if(ar<0||ac<0) {
					ar++;ac++;continue;
				}
				if(ar==cr&&ac==cc) {
					cr--;cc--;
				}
				if(cr<0||cc<0) {
					ar++;ac++;cr++;cc++;continue;
				}
				break;
			}
			}
		}
		System.out.println((char)(ar+'A')+""+(ac+1));
		System.out.println((char)(cr+'A')+""+(cc+1));
	}
	
}