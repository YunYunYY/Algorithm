#include<stdio.h>

int main()
{
	int a;
	scanf("%d", &a);
	int aa[1000000];
	for (int i = 0; i < a; i++) {
		scanf("%d", &aa[i]);
	}
	int max, min;
	max = aa[0];
	min = aa[0];

	for (int i = 0; i < a; i++) {
		if (aa[i] > max) max = aa[i];
		if (aa[i] < min) min = aa[i];
	}
	printf("%d %d\n", min, max);
	return 0;
}