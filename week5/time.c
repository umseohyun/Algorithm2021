#include <stdio.h>
#include <stdbool.h>

int h, cnt = 0;

bool check(int h, int m, int s) {
	if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
		return true;
	return false;
}

void main() {
	scanf("%d", &h);

	for (int i = 0; i <= h; i++) {
		for (int j = 0; j < 60; j++) {
			for (int k = 0; k < 60; k++) {
				if (check(i, j, k)) cnt++;
			}
		}
	}
	printf("%d\n", cnt);
}