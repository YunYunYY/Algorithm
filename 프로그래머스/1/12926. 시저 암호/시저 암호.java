class Solution {
    public String solution(String s, int n) {
        String[] L = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                      "Q","R","S","T","U","V","W","X","Y","Z"};
        String[] S = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                     "q","r","s","t","u","v","w","x","y","z"};
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                sb.append(' ');
            else if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
                int a = (int)(s.charAt(i)-'a')+n;
                sb.append(S[a%26]);
                }
            else{
                int a = (int)(s.charAt(i)-'A')+n;
                sb.append(L[a%26]);
            }
        }
        
        return sb.toString();
    }
}