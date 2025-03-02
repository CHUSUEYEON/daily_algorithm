

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			String command = sc.next();

			switch (command) {
			case "push":
				int val = sc.nextInt();
				queue.add(val);
				break;
			case "pop":
				if(!queue.isEmpty()) {
					System.out.println(queue.remove());
				}else {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(!queue.isEmpty()) {
					System.out.println(queue.peek());
				}else {
					System.out.println(-1);
				}
				break;
			case "back":
				if(!queue.isEmpty()) {
					System.out.println(((LinkedList<Integer>) queue).peekLast());
				}else {
					System.out.println(-1);
				}
				break;

			}

		}
	}

}
