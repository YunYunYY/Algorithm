class Solution {
    public String solution(String id) {
       String answerString="";
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)>='A'&&id.charAt(i)<='Z')
				answerString+=(char)(id.charAt(i)-'A'+'a');
			else answerString+=id.charAt(i);
		}
		id=answerString;
		answerString="";
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)>='a'&&id.charAt(i)<='z')
				answerString+=id.charAt(i);
			else if(id.charAt(i)=='-') answerString+=id.charAt(i);
			else if(id.charAt(i)=='_') answerString+=id.charAt(i);
			else if(id.charAt(i)=='.') answerString+=id.charAt(i);
			else if(id.charAt(i)>='0'&&id.charAt(i)<='9') answerString+=id.charAt(i);
		}
		id=answerString;
		//answerString="";
		
		while(id.contains("...")) id=id.replace("...", ".");
		//System.out.println(id);
		while(id.contains("..")) id=id.replace("..", ".");
		//System.out.println(id);
		if(id.charAt(0)=='.') id=id.substring(1);
		//System.out.println(id);
		if(id.length()!=0&&(id.charAt(id.length()-1)=='.')) 
			id=id.substring(0,id.length()-1);
		//System.out.println(id);
		if(id.length()==0) id+="a";
		if(id.length()>15) id=id.substring(0,15);
		if(id.charAt(id.length()-1)=='.') id=id.substring(0,id.length()-1);
		if(id.length()<3) {
			while(id.length()<3)
				id+=id.charAt(id.length()-1);
		}
		answerString=id;
		
		return answerString;
    }
}