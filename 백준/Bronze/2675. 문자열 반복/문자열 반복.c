#include <stdio.h>
#include<string.h>
int main()
{
	int a, b, size;
	char aa[21];
	scanf("%d", &a);
	for (int k = 0; k < a; k++) {
		scanf("%d", &b);
		scanf("%s", &aa);
		size = strlen(aa);
		for (int i = 0; i < size; i++)
			for (int j = 0; j < b; j++)
				printf("%c", aa[i]);
		printf("\n");

	}
}