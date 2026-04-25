#include <stdio.h>
#include <malloc.h>

int main()
{
	
	int a;
	float max, result=0;
	float* p;
	scanf("%d", &a);
	p = (float*)malloc(sizeof(float) * a);
	for (int i = 0; i < a; i++) {
		scanf("%f", &p[i]);
	}
	max = p[0];
	for(int i=0;i<a;i++)
		if(max<p[i])
			max = p[i];
	for (int i = 0; i < a; i++) {
		p[i] = (p[i] / max) * 100;
		result += p[i];
	}
	printf("%lf\n", result/a);
	free(p);
}