class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i=0;i<my_string.length();i++){
            char a = my_string.charAt(i);
            if (a>='A'&&a<='Z')
                answer[a-'A']++;
            else
                answer[a-'a'+26]++;
        }
        return answer;
    }
}