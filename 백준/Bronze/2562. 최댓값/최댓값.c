#include <stdio.h>

int main(void)
{
	int aa[9];
	int max = 0, max_i;
	for (int i=0; i < 9; i++)
		scanf("%d", &aa[i]);
	for (int i=0; i < 9; i++) {
		if (max < aa[i]) {
			max = aa[i];
			max_i = i+1;
		}
	}

	printf("%d\n", max);
	printf("%d\n", max_i);

	return 0;
}