#include <stdio.h>
#include <string.h>
#define max 1000000
void What(char e[]) {
	int i, j, cnt = 1;
	i = strlen(e);
	//printf("%d\n", i);
	for (j = 0; j < i; j++) {
		if (e[j] == ' ') {
			cnt++;
			//printf("%d\n", cnt);
		}
	}
	if (e[0] == ' ')
		cnt--;
	if (e[i-1] == ' ')
		cnt--;
	printf("%d", cnt);
	return;
}
main() {
	char aa[max];
	gets(aa);
	What(aa);
}