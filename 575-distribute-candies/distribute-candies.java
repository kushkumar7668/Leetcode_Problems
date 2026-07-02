class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : candyType){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int max = candyType.length/2;
        int ans = 0;
        for(int x : map.keySet()){
            ans++;
        }
        return Math.min(max, ans);
    }
}