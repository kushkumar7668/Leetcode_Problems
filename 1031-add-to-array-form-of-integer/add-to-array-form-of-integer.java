class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ll = new ArrayList<>();
        int carry = 0;
        for(int i = num.length-1; i>=0 ; i--){
            int n = num[i] + k%10 + carry;
            ll.add(n%10);
            carry = n/10;
            k/=10;
        }
        
        
        while(k!=0){
            ll.add((k%10 + carry)%10);
            carry = (k%10 + carry)/10;
            k /= 10;

        }
        if(carry==1) ll.add(carry);
       
        Collections.reverse(ll);
        return ll;
    }
}