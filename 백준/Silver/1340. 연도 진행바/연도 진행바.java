import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String b = st.nextToken();
		String c = st.nextToken();
		int a = Integer.parseInt(st.nextToken());
		String d = st.nextToken();
		
		int time=0,e=0;
		for(int i=3;i<5;i++)
			e=e*10+d.charAt(i)-'0';
		time+=e;e=0;
		for(int i=0;i<2;i++)
			e=e*10+d.charAt(i)-'0';
		time+=e*60;e=0;
		
		
		for(int i=0;i<c.length()-1;i++)
			e=e*10+c.charAt(i)-'0';
		e--;time+=e*60*24;e=0;//하루는 24시간임...
		
		if(a%4==0&&(a%100!=0||a%400==0)){//윤년
			switch(b) {
			case "December":e+=30;
			case "November":e+=31;
			case "October":e+=30;
			case "September":e+=31;
			case "August":e+=31;
			case "July":e+=30;
			case "June":e+=31;
			case "May":e+=30;
			case "April":e+=31;
			case "March":e+=29;
			case "February":e+=31;
			case "January":break;
			}
		}
		else {
			switch(b) {
			case "December":e+=30;
			case "November":e+=31;
			case "October":e+=30;
			case "September":e+=31;
			case "August":e+=31;
			case "July":e+=30;
			case "June":e+=31;
			case "May":e+=30;
			case "April":e+=31;
			case "March":e+=28;
			case "February":e+=31;
			case "January":break;
			}
		}
		time+=e*24*60;
		if(a%4==0&&(a%100!=0||a%400==0))
			e=366*60*24;
		else e=365*60*24;
		
		System.out.println((double)time/e*100);
	}
	   
}