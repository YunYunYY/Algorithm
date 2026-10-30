class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            char a = my_string.charAt(i);
            if(a>='a' && a<='z')
                sb.append((char)(a-'a'+'A'));
            else sb.append((char)(a-'A'+'a'));
        }
        return sb.toString();
    }
}