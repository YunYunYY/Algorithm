#include <stdio.h>
main(){
	int a,i;
	char aa[30],b;
	scanf("%d",&a);
	getchar();
	for(i=0;i<a;i++){
		gets(aa);
		if(aa[0]>='A'&&aa[0]<='Z')
			printf("%s\n",aa);
		else{
			aa[0]=aa[0]-'a'+'A';
			printf("%s\n",aa);
		}
	}
	
}