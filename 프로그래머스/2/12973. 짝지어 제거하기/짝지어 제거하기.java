import java.util.*;

class Solution
{
    public int solution(String s)
    {
		char[] arr = s.toCharArray();
		
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		for(char c : arr) {
			if(!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			}else {
				stack.push(c);
			}
		}
		
		if(stack.isEmpty()) answer = 1;

		return answer;
    }
}