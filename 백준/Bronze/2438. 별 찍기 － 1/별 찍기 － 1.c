#include <stdio.h>

int main(void)
{
	int a, k, cnt;
	scanf("%d", &cnt);
	//a + k = cnt;
	for (a = 0; a < cnt; a++)
	{
		for (k=0;k<=a;k++)
			printf("*");
		printf("\n");
	}
	
}