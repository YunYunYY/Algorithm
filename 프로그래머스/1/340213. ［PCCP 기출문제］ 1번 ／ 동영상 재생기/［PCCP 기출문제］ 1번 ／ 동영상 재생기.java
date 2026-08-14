class Solution {
    
    static int ttt(String s){
        String[] aa = s.split(":");
        int k = Integer.parseInt(aa[0])*60+Integer.parseInt(aa[1]);
        return k;
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int vl=ttt(video_len),p=ttt(pos),os=ttt(op_start),oe=ttt(op_end);
        if(p>=os && p<oe)
                p=oe;
        for(String i : commands){
            if(i.equals("prev"))
                p-=10;
            else if (i.equals("next"))
                p+=10;
            if (p<0)
                p=0;
            if(p>vl)
                p=vl;
            if(p>=os && p<oe)
                p=oe;
            
        }
        
        String answer = "";
        return String.format("%02d:%02d",p/60,p%60)
            ;
    }
    
}