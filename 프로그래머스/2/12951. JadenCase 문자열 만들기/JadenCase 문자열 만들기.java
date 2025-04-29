import java.util.*;

class Solution {
 public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;

        for (char c : s.toCharArray()) {
            if (isStart) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }

            isStart = (c == ' '); // 다음 문자가 단어의 시작인지 여부 갱신
        }

        return sb.toString();
    }
}