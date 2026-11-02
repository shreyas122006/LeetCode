class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int rem = (int)(0.05 * arr.length);
        int sum = 0;
        for(int i=rem; i<arr.length-rem; i++) {
            sum += arr[i];
        }
        return (double)sum/(arr.length - 2*rem);
    }
}