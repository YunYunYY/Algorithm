class Solution {
    public String solution(String s) {
        String[] aa = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean p = true;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(p&&a!=' '){
                if(a>='a' && a<='z')
                    sb.append((char)(a-'a'+'A'));
                else sb.append(a);
                p=false;
            }
            else{
                if(a==' ') {
                    p=true;
                    sb.append(a);
                }
                else if(a>='A'&&a<='Z') sb.append((char)(a-'A'+'a'));
                else sb.append(a);
            }
        }
        return sb.toString();
    }
}