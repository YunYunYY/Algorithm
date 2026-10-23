class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int id = 0;
        for(int i=0;i<picture.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<picture[i].length();j++)
                for(int n=0;n<k;n++) sb.append(picture[i].charAt(j));
            
            for(int n=0;n<k;n++){
                answer[id]=sb.toString(); id++;
            }
        }
        return answer;
    }
}