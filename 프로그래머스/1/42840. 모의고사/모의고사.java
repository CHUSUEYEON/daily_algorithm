import java.util.*;
class Solution {
    static int[] one = {1, 2, 3, 4, 5};
    static int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public int[] solution(int[] answers) {
        int size = answers.length;
		int a = 0, b = 0, c = 0;
		int idx = 0, max = 0;
		for(int i = 0; i < size; i++) {
			idx = i % one.length;
			if(answers[i] == one[idx]) a++;
			
			idx = i % two.length;
			if(answers[i] == two[idx]) b++;
			
			idx = i % three.length;
			if(answers[i] == three[idx]) c++;
 		}
		max = Math.max(a, b);
		max = Math.max(max, c);
		List<Integer> list = new ArrayList<>();
		
		if(max == a) list.add(1);
		if(max == b) list.add(2);
		if(max == c) list.add(3);
		
		return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}