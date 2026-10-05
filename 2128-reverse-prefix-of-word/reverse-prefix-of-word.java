class Solution {
    public String reversePrefix(String word, char ch) {
        
        // int idx = word.indexOf(ch);
        
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<=idx; i++) {
        //     sb.append(word.charAt(i));
        // }
        // sb.reverse();
        // for(int j=idx+1; j<word.length(); j++) {
        //     sb.append(word.charAt(j));
        // }
        // return sb.toString();


        int idx = word.indexOf(ch);

        String curr = word.substring(0,idx+1);
        StringBuilder sb = new StringBuilder(curr);
        sb.reverse();
        sb.append(word.substring(idx+1));
        return sb.toString();


        // StringBuilder sb = new StringBuilder(store[0]);
        // sb.reverse();
        // sb.append(ch);
        // sb.append(store[store.length-1]);
        // return sb.toString();
    }
}