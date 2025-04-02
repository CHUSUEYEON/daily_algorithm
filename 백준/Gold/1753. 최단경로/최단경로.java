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
		public String toString() {
			return "Edge [to=" + to + ", cost=" + cost + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
	
	static int INF = Integer.MAX_VALUE;
	static int V, E;
	static List<Edge>[] adj;
	static int[] dist;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken()); // 정점의 수 
		E = Integer.parseInt(st.nextToken()); // 간선의 수 
		int K = Integer.parseInt(br.readLine()); // 시작 정점 
		
		adj = new ArrayList[V+1];
		dist = new int[V+1];
		Arrays.fill(dist, INF);
		
		for(int i = 0; i < V+1; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			adj[s].add(new Edge(e, w));
		}// 간선 입력 완료 
		
		dijkstra(K);
//		System.out.println(Arrays.toString(dist));
		for(int i = 1; i < V+1; i++) {
			if(dist[i] == INF) {
				System.out.println("INF");
			}else {
				System.out.println(dist[i]);
			}
		}
		
	}

	 static void dijkstra(int start) {
		 PriorityQueue<Edge> pq = new PriorityQueue<>();
		 boolean[] visited = new boolean[V+1];
		 
		 dist[start] = 0;
		 pq.add(new Edge(start, 0));
		 while(!pq.isEmpty()) {
			 Edge curr = pq.poll();
			 
			 if(visited[curr.to]) continue;
			 visited[curr.to] = true;
			 
			 for(Edge node : adj[curr.to]) {
				 if(!visited[node.to] && dist[node.to] > dist[curr.to] + node.cost) {
					 dist[node.to] = dist[curr.to] + node.cost;
					 pq.add(new Edge(node.to, dist[node.to]));
				 }
			 }
		 }
		 
	}

}
