#include <stdio.h>
#include <malloc.h>

int main()
{
	int m, n;
	scanf("%d %d",&m, &n);
	int *kk = (int*)malloc(sizeof(int) * m);
	int ans = 0;
	for (int i = 0; i < m; i++)
		scanf("%d",&kk[i]);

	for (int i=0;i<m;i++)
		for(int k=i+1;k<m;k++)
			for (int j = k+1; j < m; j++) {
				int t = kk[i] + kk[k] + kk[j];
				if (t <=n && ans < t)
					ans = t;
			}
	printf("%d\n", ans);
	free(kk);
}