class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length*width*height;
        StringBuilder sb = new StringBuilder("Neither");
        if((length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) && mass >= 100) {
            sb.setLength(0);
            sb.append("Both");
        } else if(length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            sb.setLength(0);
            sb.append("Bulky");
        } else if(mass >= 100) {
            sb.setLength(0);
            sb.append("Heavy");
        }
        return sb.toString();
    }
}