#include <stdio.h>

int main()
{
	int a, stu, cnt=0;
	float hap, rate;
	int num[1000];
	scanf("%d", &a);
	for (int i = 0; i < a; i++) {
		scanf("%d", &stu);
		hap = 0; cnt = 0;
		for (int j = 0; j < stu; j++) {
			scanf("%d", &num[j]);
			hap += num[j];
		}
		hap = hap / stu;
		for (int j = 0; j < stu; j++) {
			if (num[j] > hap)
				cnt++;
		}
		rate = ((float)cnt / (float)stu)*100;
		printf("%.3f%%\n", rate);
	}
}