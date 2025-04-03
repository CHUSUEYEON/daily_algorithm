import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.PriorityQueue;

public class Main {
	
	static class Voca implements Comparable<Voca>{
		String word;

		public Voca(String word) {
			this.word = word;
		}

		@Override
		public int compareTo(Voca o) {
			int len = this.word.length() - o.word.length();
			if(len == 0) {
				return this.word.compareTo(o.word);
			}else 
				return this.word.length() - o.word.length();
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Voca other = (Voca) obj;
			return this.word.equals(other.word);
		}

		@Override
		public String toString() {
			return word;
		}
		
		
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Voca> pq = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			Voca v = new Voca(br.readLine());
//			System.out.println(pq.contains(v));
			if(pq.contains(v)) continue;
			pq.add(v);
			
		}
//		System.out.println(pq);
		for(int i = 0; i < N; i++) {
			Voca v = pq.poll();
			if(v == null) continue;
			System.out.println(v);
		}
		
		
		
	}

}