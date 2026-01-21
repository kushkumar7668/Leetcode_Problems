class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        // main logic behind original and derived array is that let say->
        // original array = [a,b,c] then derived array will be [a^b, b^c, c^a] 
        
        //so, since every element from original array is used twice in derived array so xor of all elements of derived array must be be zero  
        for(int i =0; i<derived.length; i++){
            xor ^= derived[i];
        }
        return xor ==0;
    }
}