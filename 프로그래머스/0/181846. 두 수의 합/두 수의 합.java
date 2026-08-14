import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}