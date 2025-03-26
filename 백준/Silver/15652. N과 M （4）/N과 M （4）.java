import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static boolean[] visited;
	static int[] result;
	static int[] num;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = i+1;
		}
		result = new int[M];
		visited = new boolean[N];
		
		List<Integer> current = new ArrayList<>();
		comb(N, M, 0, current);
		
		System.out.println(sb.toString().trim());
		
		
	}
	
	static StringBuilder sb = new StringBuilder();
	
	static void comb(int N, int M, int idx, List<Integer> current) {
		if(current.size() == M) {
			for(int c : current) {
				sb.append(c);
				sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = idx; i < N; i++) {
				
//			if(visited[i]) continue;
//			visited[i] = true;
			current.add(i+1);
			comb(N, M, i, current);
			current.remove(current.size()-1);
//			visited[i] = false;
		}
	}

}
