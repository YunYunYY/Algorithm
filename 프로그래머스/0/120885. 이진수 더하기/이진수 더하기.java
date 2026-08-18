class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int b1 = 0, b2 = 0;
        for(int i=0;i<bin1.length();i++){
            b1*=2;b1+=bin1.charAt(i)-'0';
        }
        for(int i=0;i<bin2.length();i++){
            b2*=2;b2+=bin2.charAt(i)-'0';
        }
        b1+=b2;
        while(b1>0){
            sb.append(b1%2);b1/=2;
        }

        return sb.isEmpty() ? "0" : sb.reverse().toString();
    }
}