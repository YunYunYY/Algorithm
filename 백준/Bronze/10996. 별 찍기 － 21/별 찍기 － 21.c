#include <stdio.h>

int main()
{
	int i;
	scanf("%d", &i);
	for (int k = 0; k <= 2 * i - 1; k++) 
	{
		for (int j = 0; j <= i - 1; j++) 
		{
			if (k % 2 == 0) 
			{
				if (j % 2 == 0)
					printf("*");
				else
					printf(" ");
			}
			else {
				if (j % 2 == 0)
					printf(" ");
				else
					printf("*");
			}
		}
		printf("\n");
	}
	return 0;
}