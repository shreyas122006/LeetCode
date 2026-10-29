class Solution {
    public String clearDigits(String s) {
        // Stack<Character> st = new Stack<>();
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<s.length(); i++) {
        //     if(!st.isEmpty() && Character.isDigit(s.charAt(i))) {
        //         st.pop();
        //     } else {
        //         st.push(s.charAt(i));
        //     }
        // }
        // while(!st.isEmpty()) {
        //     sb.append(st.pop());
        // }
        // return sb.reverse().toString();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.length() != 0 && Character.isDigit(s.charAt(i))) {
                sb.setLength(sb.length()-1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}