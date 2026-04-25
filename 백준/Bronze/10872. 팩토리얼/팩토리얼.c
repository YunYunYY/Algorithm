#include <stdio.h>

int main()
{
	int a, dap = 1;
	scanf("%d", &a);
	for (int i = 1; i <= a; i++)
		dap *= i;
	printf("%d\n", dap);
}