class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] nn = {"zero","one","two","three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ss = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0;i<10;i++)
            numbers=numbers.replaceAll(nn[i],ss[i]);
        return Long.parseLong(numbers);
    }
}