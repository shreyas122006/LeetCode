class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int rem = (int)(0.05 * n);
        int sum = 0;
        for(int i=rem; i<n -rem ; i++) {
            sum += arr[i];
        }
        return (double) sum / (n - 2*rem);
    }
}