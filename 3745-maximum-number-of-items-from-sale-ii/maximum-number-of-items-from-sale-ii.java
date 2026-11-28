class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n + 1];
        int minPrice = Integer.MAX_VALUE;
        for (int[] item : items) {
            freq[item[0]]++;
            minPrice = Math.min(minPrice, item[1]);
        }
        // Count how many different item types each factor can unlock
        int[] gain = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                gain[i] += freq[j];
            }
            gain[i]--; // Cannot receive itself for free
        }
        // Process cheaper items first
        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));
        int result = 0;
        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];
            // Normal purchases are more beneficial now
            if (price >= 2L * minPrice) {
                break;
            }
            if (gain[factor] == 0) {
                continue;
            }
            // Each purchase gives 2 items (1 paid + 1 free)
            int count = Math.min(gain[factor], budget / price);
            result += 2 * count;
            budget -= count * price;
        }
        // Spend remaining budget on the cheapest item
        result += budget / minPrice;
        return result;
    }
}