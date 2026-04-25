import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Comparator;

class Word {
	String word;
	int cnt;
	Word(String ww, int cc) {
		word = ww; cnt = cc;
	}
}

public class Main {
	static HashMap<String, Integer> map;
	static Word[] words;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
// HashMap을 만들어 각 단어가 나온 횟수를 센다
			map = new HashMap<String, Integer> ();
			for (int i=0; i<N; i++) {
				String ww = br.readLine();
				if (ww.length() <M)
					continue;
				if (map.containsKey(ww) == true)
					map.put(ww, map.get(ww)+1);
				else
					map.put(ww, 1);
			}
// 단어와 그 단어가 나온 횟수를 words 배열에 넣는다.
			int ll = map.size();
			words = new Word[ll];
			int idx = 0;
			for (String ww: map.keySet()) {
				words[idx++] = new Word(ww, map.get(ww));
			}
// 문제에서 주어진 조건대로 정렬을 한다.			
	        Arrays.sort(words, new Comparator<Word>() {
	        	@Override
	        	public int compare(Word o1, Word o2) {
	        		int res = o2.cnt - o1.cnt;
	        		if (res !=0) return res;
	        		res = o2.word.length() - o1.word.length();
	        		if (res !=0) return res;
	        		return o1.word.compareTo(o2.word);
	        	}
	        });
// 출력한다
	        StringBuilder sb = new StringBuilder();
	        for (Word ww: words) 
	        	sb.append(ww.word+"\n");
	        System.out.println(sb.toString());
	        
		}
	    catch (IOException e) {
	         System.err.println("Error: " + e);
	    }

	}

}
