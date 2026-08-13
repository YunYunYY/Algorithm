import java.util.HashMap;
class Solution {
    public int solution(String[] order) {
        HashMap<String,Integer> aa = new HashMap<>();
        aa.put("iceamericano",4500);aa.put("americanoice",4500);
        aa.put("hotamericano",4500);aa.put("americanohot",4500);
        
        aa.put("icecafelatte",5000);aa.put("cafelatteice",5000);
        aa.put("hotcafelatte",5000);aa.put("cafelattehot",5000);
        
        aa.put("americano",4500);aa.put("cafelatte",5000);aa.put("anything",4500);
        int answer = 0;
        for(String i : order)
            answer+=aa.get(i);
        return answer;
    }
}