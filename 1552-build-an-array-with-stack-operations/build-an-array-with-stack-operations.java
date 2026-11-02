class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> store = new ArrayList<>();
        int j = 1;
        for(int i = 0; i < target.length; i++) {
            while(j < target[i]) {
                store.add("Push");
                store.add("Pop");
                j++;
            }
            store.add("Push");
            j++;
        }
        return store;
    }
}