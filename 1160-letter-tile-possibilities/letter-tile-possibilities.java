class Solution {
    HashSet<String> set = new HashSet<>();
    public void backtrack(String tiles, boolean[] used, String curr) {
        if(!curr.equals("")) {
            set.add(curr);
        }
        for(int i = 0; i < tiles.length(); i++) {
            if(!used[i]) {
                used[i] = true;
                backtrack(tiles, used, curr + tiles.charAt(i));
                used[i] = false;
            }
        }
    }
    public int numTilePossibilities(String tiles) {
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, used, "");
        return set.size();
    }
}