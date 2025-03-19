import java.util.Scanner;

public class Main {

	static int N;
	static int M;
	static boolean[] sel;
	static int[] result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sel = new boolean[N];
		result = new int[M];
		perm(0);
	}

	static void perm(int idx) {
		if(idx == M) {
			for(int i = 0; i < M; i++) {
					System.out.print(result[i] + " ");					
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
				
			if(sel[i-1]) continue;
			
			sel[i-1] = true;
			result[idx] = i;
			perm(idx+1);
			sel[i-1] = false;
			
			
		}
	}
}
