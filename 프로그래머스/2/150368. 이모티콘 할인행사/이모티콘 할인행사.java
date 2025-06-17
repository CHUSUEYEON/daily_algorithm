import java.util.*;

class Solution {
    int[] discountRates = {10, 20, 30, 40}; // 이모티콘 할인율
    int maxSubscribers = 0;
    int maxRevenue = 0;

    public int[] solution(int[][] users, int[] emoticons) {
        int[] discounts = new int[emoticons.length]; // 각 이모티콘에 대한 할인율 조합 저장
        dfs(0, discounts, users, emoticons); // 모든 할인율 조합 탐색
        return new int[]{maxSubscribers, maxRevenue};
    }

    // 할인율 조합 완전탐색
    private void dfs(int depth, int[] discounts, int[][] users, int[] emoticons) {
        if (depth == emoticons.length) {
            evaluate(discounts, users, emoticons);
            return;
        }

        for (int rate : discountRates) {
            discounts[depth] = rate;
            dfs(depth + 1, discounts, users, emoticons);
        }
    }

    // 현재 할인율 조합에 대한 가입자 수와 매출 계산
    private void evaluate(int[] discounts, int[][] users, int[] emoticons) {
        int subscriberCount = 0;
        int revenue = 0;

        for (int[] user : users) {
            int userDiscountThreshold = user[0]; // 최소 할인율 조건
            int userSpendingLimit = user[1];     // 구독 전환 기준
            int totalSpent = 0;

            for (int i = 0; i < emoticons.length; i++) {
                int rate = discounts[i];
                if (rate >= userDiscountThreshold) {
                    totalSpent += emoticons[i] * (100 - rate) / 100;
                }
            }

            if (totalSpent >= userSpendingLimit) {
                subscriberCount++;
            } else {
                revenue += totalSpent;
            }
        }

        // 조건에 맞게 최대 가입자 수, 최대 매출 갱신
        if (subscriberCount > maxSubscribers) {
            maxSubscribers = subscriberCount;
            maxRevenue = revenue;
        } else if (subscriberCount == maxSubscribers) {
            maxRevenue = Math.max(maxRevenue, revenue);
        }
    }
}
