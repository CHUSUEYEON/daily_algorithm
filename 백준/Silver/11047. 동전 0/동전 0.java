import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int N, K;
	static List<Integer> coins;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		coins = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int coin = sc.nextInt();
			if(K/coin == 0) continue;
			coins.add(coin);
//			System.out.println(coins.get(i));
		}
		
		int count = 0;
		for(int i = coins.size()-1; i >= 0; i--) {
			if(K == 0) break;
			int m = K/coins.get(i);
			if(K/coins.get(i) != 0) {
				K = K - coins.get(i) * m;
				count += m;
			}
		}
		
		System.out.println(count);
		
	}

}
