import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int i;
		int cnt = 0;
		int[] arr = new int[N];
		
		for(i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		for(i = N - 1; i >= 0; i--) {
 
			if(arr[i] <= K) {
				cnt += (K / arr[i]);
				K = K % arr[i];
			}
		}
		System.out.println("필요 동전 개수의 최솟값 : " + cnt);
	}
 
}