import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Edge implements Comparable<Edge>{
		int to, cost;

		public Edge(int to, int cost) {
			super();
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.cost, o.cost);
		}

		@Override
		public String toString() {
			return "Edge [to=" + to + ", cost=" + cost + "]";
		}
		
		
	}
	
	static int INF = Integer.MAX_VALUE;
	static int N, M;
	static List<Edge>[] adj;
	static int[] dist;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		adj = new ArrayList[N+1];
		for(int i = 0; i < N+1; i++)
			adj[i] = new ArrayList<>();
		dist = new int[N+1];
		Arrays.fill(dist, INF);
		prev = new int[N+1];
		
		StringTokenizer st;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			adj[s].add(new Edge(e, cost));
		}
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		// input
		
		djikstra(A);
		System.out.println(dist[B]);
		
		List<Integer> path = new ArrayList<>();
		int curr = B;
		while(curr != -1) {
			path.add(curr);
			curr = prev[curr];
		}
		
		System.out.println(path.size());
		
		for(int i = path.size()-1; i >= 0; i--) {
			System.out.print(path.get(i) + " ");
		}
	}
	
	static int[] prev;

	static void djikstra(int start) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();	
		boolean[] visited = new boolean[N+1];
		
		dist[start] = 0;
		prev[start] = -1;
		pq.add(new Edge(start, 0));
		while(!pq.isEmpty()) {
			Edge curr = pq.poll();
			
			if(visited[curr.to]) continue;
			visited[curr.to] = true;
			
			for(Edge node : adj[curr.to]) {
				if(!visited[node.to] && dist[node.to] > dist[curr.to] + node.cost) {
					dist[node.to] = dist[curr.to] + node.cost;
					prev[node.to] = curr.to;
					pq.add(new Edge(node.to, dist[node.to]));
				}
			}
			
		}// while
	}
	

}
