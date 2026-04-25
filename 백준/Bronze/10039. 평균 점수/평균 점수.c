#include <stdio.h>

int main() {
	
	int aa[5];
	int hap = 0;
	for (int i = 0; i < 5; i++) {
		scanf("%d", &aa[i]);
		if (aa[i] < 40)
			aa[i] = 40;
		hap += aa[i];
	}
	printf("%d\n", hap/5);
	
}