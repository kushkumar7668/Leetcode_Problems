import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to handle duplicates
        backtrack(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    
    private void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> current, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));  // Found a valid combination
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue; // Skip duplicates

            if (candidates[i] > target) break; // No point in continuing if the number exceeds target

            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], ans, current, i + 1); // Move to next index
            current.remove(current.size() - 1); // Backtrack
        }
    }
}


// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ll = new ArrayList<>();
//         Arrays.sort(candidates);
//         Permutation(candidates, target, ans, ll, 0);
//         return ans;
//     }
    
//     public static void Permutation(int[] candidates, int target, List<List<Integer>> ans, List<Integer> ll, int index){
//         if(target == 0){
//             ans.add(new ArrayList<>(ll));
//             return;
//         }
        
//         for(int i = index; i< candidates.length; i++){
//             if(target >= candidates[i]){
//                 ll.add(candidates[i]);
//                 Permutation(candidates, target - candidates[i], ans, ll, i+1);  // since there is infinite supply that's why we have not use i+1
//                 ll.remove(ll.size()-1);
//             }
 
//         }
//     }
// }

