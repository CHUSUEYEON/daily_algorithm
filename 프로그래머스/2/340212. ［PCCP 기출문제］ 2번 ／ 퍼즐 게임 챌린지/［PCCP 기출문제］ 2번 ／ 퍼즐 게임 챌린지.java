class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1;
        int right = 1_000_000_000;  // diffs 최대치보다 충분히 크게
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long time = calculateTime(diffs, times, mid);

            if (time <= limit) {
                answer = mid;
                right = mid - 1;  // 더 작은 level 찾아보기
            } else {
                left = mid + 1;   // 더 큰 level 필요
            }
        }

        return answer;
    }

    private long calculateTime(int[] diffs, int[] times, int level) {
        long time = times[0];

        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] <= level) {
                time += times[i];
            } else {
                long cnt = diffs[i] - level;
                time += (times[i - 1] + times[i]) * cnt + times[i];
            }
        }

        return time;
    }
}
