#include <stdio.h>

int main(void) {
    int N, K, i;
    int cnt = 0;
    int arr[10];
    scanf("%d %d", &N, &K);
    for( i=0; i<N; i++){
        scanf("%d", &arr[i]);
    }
    i = N-1;
    while(K != 0){
        if(K >= arr[i]){
            K=K-arr[i];
            cnt++;
        }
        else {
            i--;
        }
    }
    printf("필요 동전 개수의 최솟값 : %d", cnt);
}