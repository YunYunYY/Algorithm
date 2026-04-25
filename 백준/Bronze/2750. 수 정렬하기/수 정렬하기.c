#include <stdio.h>
#include <malloc.h>

int main() {
	
	int cnt,i,k,tmp;
	scanf("%d", &cnt);
	int* aa;
	aa =(int*) malloc(sizeof(int) * cnt);
	for (i = 0; i < cnt; i++)
	{
		scanf("%d", &aa[i]);
	}

	for (i = 0; i < cnt; i++)
	{
		for (k=0;k<cnt-1;k++)
			if (aa[k] > aa[i]) {
				tmp = aa[k];
				aa[k] = aa[i];
				aa[i] = tmp;
			}
	}
	
	for (i = 0; i < cnt; i++)
		printf("%d\n", aa[i]);
	free(aa);

}