class Solution {
    public int countPartitions(int[] nums) {

        // int sum  = Arrays.stream(nums).sum();
        // int c =0;
        // int left = 0;
        // int right = 0;
        // for(int i =0; i<nums.length-1; i++){
        //     left += nums[i];
        //     right = sum -left;
        //     if(Math.abs(right-left)%2 == 0) c++;


        // }
        // return c;



        // suppose left sum is x and rightsum is y and total sum is s
        /*  since    x + y = s    ------(i)   -> y = s-x
        and we have to find ->  x - y  -----(ii)

        put value of y ine eq (ii) then -

            #)  x-y = x - (s-x)  -> 2x -s  ----(iii)


            since 2x is always even , hence if s is even then all partions will hav evn difference  ans number of partions is n-1
            */



        // most optimal solution ->

        int sum =  Arrays.stream(nums).sum();

        return sum%2 == 0 ? nums.length-1 : 0;          

    }
}