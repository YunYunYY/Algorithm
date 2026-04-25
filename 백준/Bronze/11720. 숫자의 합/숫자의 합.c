#include <stdio.h>

int main()
{
	int a, qwe = 0;
	char aa[101];
	scanf("%d", &a);
	scanf("%s", &aa);
	for (int i = 0; i < a; i++) {
		qwe += aa[i] - '0';
	}
	printf("%d",qwe);
}