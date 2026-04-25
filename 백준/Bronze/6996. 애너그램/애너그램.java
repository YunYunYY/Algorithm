import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static boolean solveAnagrams(String b, String c ) {
        int[] aa = new int[26];
        for(int j=0;j<b.length();j++)
				aa[b.charAt(j)-'a']++;
			for(int j=0;j<c.length();j++)
				aa[c.charAt(j)-'a']--;
			boolean k = true;
			for(int j=0;j<26;j++)
				if(aa[j]!=0) return false;
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
