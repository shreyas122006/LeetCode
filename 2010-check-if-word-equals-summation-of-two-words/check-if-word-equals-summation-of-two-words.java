class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for(char curr : firstWord.toCharArray()) {
            sb1.append(curr - 'a');
        }
        for(char curr : secondWord.toCharArray()) {
            sb2.append(curr - 'a');
        }
        for(char curr : targetWord.toCharArray()) {
            sb3.append(curr - 'a');
        }
        int num1 = Integer.parseInt(sb1.toString());
        int num2 = Integer.parseInt(sb2.toString());
        int num3 = Integer.parseInt(sb3.toString());
        return (num1 + num2) == num3;
    }
}