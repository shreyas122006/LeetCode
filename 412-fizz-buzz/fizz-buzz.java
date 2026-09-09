class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> Store = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                Store.add("FizzBuzz");
            } else if(i % 3 == 0) {
                Store.add("Fizz");
            } else if(i % 5 == 0) {
                Store.add("Buzz");
            } else {
                Store.add(Integer.toString(i));
            }
        }
        return Store;
    }
}