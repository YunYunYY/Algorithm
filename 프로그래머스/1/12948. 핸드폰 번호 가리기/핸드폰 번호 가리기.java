class Solution {
    public String solution(String p) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<p.length()-4;i++)
            sb.append("*");
        for(int i=p.length()-4;i<p.length();i++)
            sb.append(p.charAt(i));
        return sb.toString();
    }
}