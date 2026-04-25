#include <stdio.h>
main(){
	char aa[100];
	int i;
	scanf("%s",aa);
	for(i=0;i<strlen(aa);i++){
		if(aa[i]>='A'&&aa[i]<='Z')
			aa[i]=aa[i]-'A'+'a';
		else
			aa[i]=aa[i]-'a'+'A';
	}
	printf("%s",aa);
}