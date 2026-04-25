#include <stdio.h>

int main()
{
	int a, b, c, ans, ans1;
	int num[10] = { 0, };
	scanf("%d %d %d", &a, &b, &c);
	ans = a * b * c;
	while (ans >= 1) {
		ans1 = ans % 10;
		switch (ans1)
		{
			case 0: num[0]++; break;
			case 1: num[1]++; break;
			case 2: num[2]++; break;
			case 3: num[3]++; break;
			case 4: num[4]++; break;
			case 5: num[5]++; break;
			case 6: num[6]++; break;
			case 7: num[7]++; break;
			case 8: num[8]++; break;
			case 9: num[9]++; break;
		}
		ans = (ans - ans1)/10;
	}
	for (int i = 0; i < 10; i++)
		printf("%d\n", num[i]);
}