#include <stdio.h>

int dx[] = { -2, -2, 2, 2, -1, -1, 1, 1 };
int dy[] = { -1, 1, -1, 1, -2, 2, -2, 2 };
char knight[3];

void main() {
	scanf("%s", knight);
	int row = knight[1] - '0';
	int column = knight[0] - 'a' + 1;
	int result = 0;

	for (int i = 0; i < 8; i++) {
		int Row = row + dx[i];
		int Col = column + dy[i];

		if (Row >= 1 && Row <= 8 && Col >= 1 && Col <= 8)
			result++;
	}
	printf("%d\n", result);

}