class Solution {
    public String reverseByType(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == '!' || curr == '@' || curr == '#' || curr == '$' || curr == '%' || curr == '^' || curr == '&' || curr == '*' || curr == '(' || curr == ')') {
                st2.push(curr);
            } else {
                st1.push(curr);
            }
        }
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == '!' || curr == '@' || curr == '#' || curr == '$' || curr == '%' || curr == '^' || curr == '&' || curr == '*' || curr == '(' || curr == ')') {
                sb.append(st2.pop());
            } else {
                sb.append(st1.pop());
            }
        }
        return sb.toString();
    }
}