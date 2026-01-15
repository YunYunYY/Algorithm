class Solution {
    public String solution(String my_string) {
        String[] aa = {"a","e","i","o","u"};
        for(int i=0;i<aa.length;i++)
            my_string=my_string.replace(aa[i],"");
        return my_string;
    }
}