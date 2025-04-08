import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int ans = func(N);
		System.out.println(ans);
	}

	private static int func(int n) {
		if(n == 0) {
			return 1;
		}
		
		int m = func(n-1);
		
		return n * m;
	}

}
