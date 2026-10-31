class Solution {
    public double minimumAverage(int[] nums) {
       List<Integer> store = new ArrayList<>(nums.length);
        for (int num : nums) {
            store.add(num);
        }

        ArrayList<Double> avg = new ArrayList<>();
        Collections.sort(store);
        while(!store.isEmpty()) {
            int min = store.remove(0);
            int max = store.remove(store.size()-1);
            avg.add((double)(min+max)/2);
        }
        double minE = Integer.MAX_VALUE;
        for(Double curr : avg) {
            minE = Math.min(minE,curr);
        }
        return minE;
    }
}