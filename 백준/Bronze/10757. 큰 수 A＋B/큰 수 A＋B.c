#include <stdio.h>
#include <string.h>
char aa[10005],bb[10005],cc[10005];
void rere(char qq[]){
	int len = strlen(qq);
	int i;
	char qwe;
	for(i=0;i<len/2;i++){
		qwe=qq[i];
		qq[i]=qq[len-1-i];
		qq[len-1-i]=qwe;}
	}
int main(){
	int i,size,c=0,ab;
	scanf("%s %s",aa,bb);
	rere(aa);rere(bb);
	size=strlen(aa)>strlen(bb)?strlen(aa):strlen(bb);
	
	for(i=0;i<size;i++){
		ab=aa[i]-'0'+bb[i]-'0'+c;
		if(ab<0)ab+='0';
		if(ab>9) c=1;
		else c=0;
		cc[i]=ab%10+'0';
	}
	if(c==1) cc[size]='1';
	rere(cc);
	printf("%s",cc);
	
}