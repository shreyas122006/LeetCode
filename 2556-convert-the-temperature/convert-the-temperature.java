class Solution {
    public double[] convertTemperature(double celsius) {
        double[] conv = new double[2];
        conv[0] = celsius + 273.15;
        conv[1] = (celsius * 1.80) + 32.00;
        return conv;
    }
}