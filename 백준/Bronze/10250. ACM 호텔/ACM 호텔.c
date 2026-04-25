#include <stdio.h>
main() {
	int t, i, h, w, n, ch, kan;
	scanf("%d", &t);
	for (i = 0; i < t; i++) {
		scanf("%d %d %d", &h, &w,&n);
		ch = n % h;
		if (ch == 0) {
			ch = h;
			kan = n / h;
		}
		else
			kan = n / h + 1;
		
		printf("%d%02d\n", ch, kan);
	}
}