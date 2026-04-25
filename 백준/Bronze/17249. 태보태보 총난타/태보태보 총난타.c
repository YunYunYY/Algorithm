#include <stdio.h>
#include <string.h>
int main() {
	int i, check=0, cntF=0, cntB=0,size;
	char qq[1001];
	scanf("%s", &qq);
	size = strlen(qq);
	for (i = 0; i < size; i++) {
		if (qq[i] == '(')
			check = 1;
		if (check == 0)
			if (qq[i] == '@')
				cntF++;
		if (check == 1)
			if (qq[i] == '@')
				cntB++;
	}
	printf("%d %d", cntF, cntB);
}