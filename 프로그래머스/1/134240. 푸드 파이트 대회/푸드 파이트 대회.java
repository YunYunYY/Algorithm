class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        //sb.append();
        for(int i=food.length-1;i>0;i--){
            for(int j=0;j<food[i]/2;j++)
                sb.append(i);
        }
        sb=new StringBuilder(sb.reverse().toString()+"0"+sb.reverse().toString());
        return sb.toString();
    }
}