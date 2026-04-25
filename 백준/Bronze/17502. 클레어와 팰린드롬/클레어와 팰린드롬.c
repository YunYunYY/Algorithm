#include <stdio.h>
int main() {
	int a, i;
	char dd[100];
	scanf("%d", &a);
	scanf("%s", &dd);

	for (i = 0; i <= a; i++) {
		if (dd[i] == '?' && dd[a - 1] == '?') {
			dd[i] = 'a';
			dd[a - 1] = dd[i];
		}
		else if (dd[i] == '?')
			dd[i] = dd[a - 1];
		else if (dd[a - 1] == '?')
			dd[a - 1] = dd[i];
		a--;
	}
	printf("%s", dd);
}