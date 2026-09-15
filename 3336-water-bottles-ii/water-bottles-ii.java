class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        return numBottles + (int)(Math.sqrt(numExchange * numExchange - 3 * numExchange + 2 * numBottles + 0.25) - numExchange + 1.5);
    }
}