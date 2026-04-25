#include<stdio.h>
int main()
{
	int a, qwe=0;
	scanf("%d", &a);
	for (int i = 0; i < a+1; i++)
		qwe += i;
	printf("%d\n", qwe);
}