class Solution {
    public long calculateScore(String s) {

        long score=0;
        // this line creates an array of size 26 with a stack assigned to each index;
        Stack<Integer>[] lastSeen= new Stack[26];
        for(int i=0;i<26;i++){
            lastSeen[i]=new Stack<>();
        }

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            int currIdx=curr - 'a';
            int mirrorIdx=25-currIdx;

            if(!lastSeen[mirrorIdx].isEmpty()){
                int prevIdx=lastSeen[mirrorIdx].pop();
                score+= (i-prevIdx);
            }
            else{
                lastSeen[currIdx].push(i);
            }
        }
        return score;
    }
}


// class Solution {
//     long calculateScore(String s) {
//         long ans = 0;
//         Map<Integer, List<Integer>> mp = new HashMap<>();
//         for (int i = 0; i < s.length(); ++i) {
//             int cur = s.charAt(i) - 'a';
//             int mirror = 25 - cur;
//             if (mp.containsKey(mirror) && mp.get(mirror).size() > 0) {
//                 ans += (long) i - (long) mp.get(mirror).get(mp.get(mirror).size() - 1);
//                 mp.get(mirror).remove(mp.get(mirror).size() - 1);
//             } else
//                 mp.computeIfAbsent(cur, key -> new ArrayList<>()).add(i);
//         }
//         return ans;
//     }
// }