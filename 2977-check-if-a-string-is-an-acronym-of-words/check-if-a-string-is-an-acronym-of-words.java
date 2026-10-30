class Solution {
    public boolean isAcronym(List<String> words, String s) {
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<words.size(); i++) {
        //     sb.append(words.get(i).charAt(0));
        // }
        // return s.equals(sb.toString());
        if(words.size() != s.length()) {
            return false;
        }
        for(int i=0; i<words.size(); i++) {
            if(words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}