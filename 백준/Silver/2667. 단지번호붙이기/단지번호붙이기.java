import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N;
	static char[][] town;
	static List<Integer> house;
	static int count;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		town = new char[N][N];
		house = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
				town[i] = sc.next().toCharArray();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(town[i][j] == '1') {
					count = 0;
					bfs(i, j);
					house.add(count);
				}
			}
		}
		
		Collections.sort(house);
		
		System.out.println(house.size());
		for(int i : house) {
			System.out.println(i);
		}
	}

	 static void bfs(int r, int c) {
		 town[r][c] = '0';
		 Queue<int[]> q = new LinkedList<>();
		 q.add(new int[] {r,c});
		 while(!q.isEmpty()) {
			 count++;
			 int[] cur = q.poll();
			 for(int d = 0; d< 4; d++) {
				 int nr = cur[0] + dr[d];
				 int nc = cur[1] + dc[d];
				 
				 if(nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
				 if(town[nr][nc] == '0') continue;
				 
				 town[nr][nc] = '0';
				 q.add(new int[] {nr, nc});
			 }
		 }
	}

}
