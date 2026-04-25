#include<stdio.h>
int main()
{
	int aa[10000] = { 0, };
	int a, b;
	scanf("%d %d", &a, &b);
	for (int i = 0; i < a; i++)
		scanf("%d", &aa[i]);
	for (int i = 0; i < a; i++)
		if (aa[i] < b)
			printf("%d ", aa[i]);
}