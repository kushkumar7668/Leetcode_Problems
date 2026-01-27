class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i =1; i<=n; i++) ll.add(i);
        int curr = 0;   //current index or current player
        int next = k-1%n;   // next player to be removed
        while(ll.size()>1){
            ll.remove(ll.get(next));
            curr = next;
            next = (curr + k-1) % ll.size();
        }
        return ll.get(0);
    }
}