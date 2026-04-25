#include <stdio.h>

int main()
{
	int a = 0, cnt = 0, first = 0, result = 0;
	int tmp_a = 0, tmp_b = 0;
	scanf("%d", &a);
	
	if (a < 10)
		a = a * 10;
	first = a;
	while (first != result)
	{
		tmp_a = a / 10;
		tmp_b = a % 10;
		a = (tmp_a + tmp_b) % 10;
		a = (tmp_b * 10) + a;
		result = a;
		cnt++;		
	}
	if (a == 0)
		cnt = 1;
	printf("%d\n", cnt);

	return 0;
}