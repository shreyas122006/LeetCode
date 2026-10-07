// class Solution {
//     public int calPoints(String[] operations) {
//         ArrayList<Integer> store = new ArrayList<>();
//         for(String curr : operations) {
//             if(curr.matches("-?\\d+")) {
//                 store.add(Integer.parseInt(curr));
//             } else if(curr.equals("C")) {
//                 store.removeLast();
//             } else if(curr.equals("D")) {
//                 store.add(2*store.get(store.size()-1));
//             } else if(curr.equals("+")) {
//                 int num1 = store.get(store.size()-1);
//                 int num2 = store.get(store.size()-2);
//                 store.add(num1+num2);
//             }
//         }
//         int sum = 0;
//         for(int curr : store) {
//             sum += curr;
//         }
//         return sum;
//     }
// }
class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String curr : operations) {
            if (curr.equals("C")) {
                stack.pop();
            } else if (curr.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (curr.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            } else {
                stack.push(Integer.parseInt(curr));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}