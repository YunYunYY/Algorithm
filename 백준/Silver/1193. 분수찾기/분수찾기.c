#include <stdio.h>
int main() {
	int i, k, aa;
	int bb = 0, m;
	scanf("%d", &aa);
	for (i = 1; bb < aa;i++) {
		bb += i;
	}
	bb = bb - aa;
	if (i % 2 == 0) {
		//printf("%d %d\n", bb,i);
		for (k = 0; k <= bb; k++) {
			m = i - k-1;
		}
		printf("%d/%d\n", k , m);
	}
	else {
		//printf("짝수줄\n");
		for (k = 0; k <= bb; k++) {
			m = i - k - 1;
		}
		printf("%d/%d\n", m, k);
		
	}
}