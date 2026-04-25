#include <stdio.h>
#include <string.h>
int main() {
	char aa[16] = { 'q','w','e','r','t','y','a','s','d','f','g','z','x','c','v','b' };
	char aa1[10] = { 'u','i','o','p','h','j','k','l','n','m' };
	char inp[101];
	int i, ll = 0, rr = 0, mm = 0, k, size;
	gets(inp);
	size = strlen(inp);
	for (i = 0; i < size; i++) {
		if (inp[i] >= 'A' && inp[i] <= 'Z') {
			mm++;
			inp[i] += 32;
		}
		else if (inp[i] == ' ')
			mm++;
	}
	for (i = 0; i < size; i++)
		for (k = 0; k < 16; k++) {
			if (inp[i] == aa[k]) {
				ll++;
			}
		}
	for(i=0;i<size;i++)
		for(k=0;k<10;k++)
			if (inp[i] == aa1[k]) {
				rr++;
			}
	while (mm != 0) {
		if (ll <= rr) {
			ll++;
			mm--;
		}
		else {
			rr++;
			mm--;
		}
	}
	printf("%d %d", ll, rr);
}