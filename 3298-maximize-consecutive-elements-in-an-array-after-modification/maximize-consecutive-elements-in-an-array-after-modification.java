class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);

        HashMap<Integer, Integer> dp = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            int a = dp.getOrDefault(num, 0) + 1;
            int b = dp.getOrDefault(num - 1, 0) + 1;

            dp.put(num + 1, Math.max(dp.getOrDefault(num + 1, 0), a));
            dp.put(num, Math.max(dp.getOrDefault(num, 0), b));

            result = Math.max(result, Math.max(a, b));
        }

        return result;
    }
}