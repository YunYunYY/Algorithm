#include <stdio.h>
int main() {
	int a, cnt = 1, b = 1, i=1;
	scanf("%d", &a);
	while (a > b) {
		b += i * 6;
		i++;
		cnt++;
	}
	printf("%d", cnt);
}