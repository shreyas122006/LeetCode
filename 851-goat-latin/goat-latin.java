class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int i = 0;
        int idx = 0;
        StringBuilder total = new StringBuilder();
        for(String curr : words) {
            i = idx;
            StringBuilder test = new StringBuilder(curr);
            if(curr.charAt(0) == 'a' || curr.charAt(0) == 'e' || curr.charAt(0) == 'i' || curr.charAt(0) == 'o' || curr.charAt(0) == 'u' || curr.charAt(0) == 'A' || curr.charAt(0) == 'E' || curr.charAt(0) == 'I' || curr.charAt(0) == 'O' || curr.charAt(0) == 'U') {
                test.append("ma");
                while(i > -1) {
                    test.append('a');
                    i--;
                }
            } else {
                char temp = curr.charAt(0);
                test.append(temp);
                test.deleteCharAt(0);
                test.append("ma");
                while(i > -1) {
                    test.append('a');
                    i--;
                }
            }
            total.append(test);
            total.append(" ");
            idx++;
        }
        total.deleteCharAt(total.length()-1);
        return total.toString(); 
    }
}