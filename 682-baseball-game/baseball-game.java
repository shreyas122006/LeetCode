class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> store = new ArrayList<>();
        for(String curr : operations) {
            if(curr.matches("-?\\d+")) {
                store.add(Integer.parseInt(curr));
            } else if(curr.equals("C")) {
                store.removeLast();
            } else if(curr.equals("D")) {
                store.add(2*store.get(store.size()-1));
            } else if(curr.equals("+")) {
                int num1 = store.get(store.size()-1);
                int num2 = store.get(store.size()-2);
                store.add(num1+num2);
            }
        }
        int sum = 0;
        for(int curr : store) {
            sum += curr;
        }
        return sum;
    }
}