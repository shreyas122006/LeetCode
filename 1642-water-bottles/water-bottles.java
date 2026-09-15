class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles; //Initially drink all
        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return totalBottles;
    }
}