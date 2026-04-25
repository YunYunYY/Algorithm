#include <stdio.h>
#include <string.h>

int main() {
	char aa[101];
	int size, i, dap = 0;
	scanf("%s", &aa);
	size = strlen(aa);
	for (i = 0; i < size; i++) {
		if (aa[i] == 'c' && aa[i + 1] == '=') {
			dap++; i++;
		}
		else if (aa[i] == 'c' && aa[i + 1] == '-') {
			dap++; i++;
		}
		else if (aa[i] == 'd' && aa[i + 1] == '-') {
			dap++; i++;
		}
		else if (aa[i] == 'l' && aa[i + 1] == 'j') {
			dap++; i++;
		}
		else if (aa[i] == 'n' && aa[i + 1] == 'j') {
			dap++; i++;
		}
		else if (aa[i] == 's' && aa[i + 1] == '=') {
			dap++; i++;
		}
		else if (aa[i] == 'z' && aa[i + 1] == '=') {
			dap++; i++;
		}
		else if (aa[i] == 'd' && aa[i + 1] == 'z' && aa[i + 2] == '=') {
			dap++; i = i + 2;
		}
		else
			dap++;
	}
	printf("%d\n", dap);
}