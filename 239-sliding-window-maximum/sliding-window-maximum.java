class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        //addFirst
        //addLast
        //removeFirst
        //getFirst
        //getLast
        int n = nums.length;
        int j=0;
        int arr[]=new int[n-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();    // remove last
            }
            dq.addLast(i);  // add last
        }
        arr[j++]=nums[dq.getFirst()];
        for(int i=k;i<n;i++){   
            if(dq.getFirst()<=(i-k)){
                dq.removeFirst();   // remove first
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();    //remove last
            }
            dq.addLast(i);
            arr[j++]=nums[dq.getFirst()];
        }
        return arr;
    }
}