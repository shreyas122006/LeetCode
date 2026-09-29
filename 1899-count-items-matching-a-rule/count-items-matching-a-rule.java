// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         // int count = 0;
//         // for(List<String> item : items) {
//         //     if((ruleKey.equals("type") && item.get(0).equals(ruleValue)) || (ruleKey.equals("color") && item.get(1).equals(ruleValue)) || (ruleKey.equals("name") && item.get(2).equals(ruleValue))) {
//         //         count++;
//         //     }
//             // else if(ruleKey == "color" && item.get(1).equals(ruleValue)) {
//             //     count++;
//             // }
//             // else if(ruleKey == "name" && item.get(2).equals(ruleValue)) {
//             //     count++;
//             // }
//         }
//         return count;
//     }
// }
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if(ruleKey.equals("color")) {
            index = 1;
        }
        else if(ruleKey.equals("name")) {
            index = 2;
        }
        int count = 0;
        for(List<String> item : items) {
            if(item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}