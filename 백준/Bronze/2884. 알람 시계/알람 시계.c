#include <stdio.h>

int main() {
	int a, b;
	int time;
	scanf("%d %d", &a, &b);
	time = a * 60 + b;
	time -= 45;
	if (time<0)
	{
		a = 23;
		b = b + 15;
	}
	else
	{
		a = time / 60;
		b = time % 60;
	}
	printf("%d %d\n", a, b);

}