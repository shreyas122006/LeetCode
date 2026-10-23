class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int maxU = 0;
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            int boxes = Math.min(boxTypes[i][0], truckSize);
            maxU += boxes * boxTypes[i][1];
            truckSize -= boxes;
        }
        return maxU;
    }
}