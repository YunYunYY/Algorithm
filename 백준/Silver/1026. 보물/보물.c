#include <stdio.h>
#include <malloc.h>

int main() {
	
	int cnt, i, k, tmp, s=0;
	scanf("%d", &cnt);
	int* aa;
	int* bb;
	aa =(int*) malloc(sizeof(int) * cnt);
	bb = (int*)malloc(sizeof(int) * cnt);

	for (i = 0; i < cnt; i++)
	{
		scanf("%d", &aa[i]);
		
	}
	for (i = 0; i < cnt; i++)
	{
		scanf("%d", &bb[i]);

	}

	for (i = 0; i < cnt; i++)
	{
		for (k = 0; k < cnt - 1; k++)
		{
			if (aa[k] > aa[i]) {
				tmp = aa[k];
				aa[k] = aa[i];
				aa[i] = tmp;
			}
			if (bb[k] < bb[i]) {
				tmp = bb[k];
				bb[k] = bb[i];
				bb[i] = tmp;
			}
		}
	}
	
	for (i = 0; i < cnt; i++)
		s += aa[i] * bb[i];//printf("%d\n", aa[i]);
	printf("%d\n", s);
	free(aa);
	free(bb);

}