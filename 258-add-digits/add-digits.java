class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int sum = 0;
        while(true){
            sum = 0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            num = sum;
            if(sum>9) continue;
            else break;
            
        }
        return sum;
    }
}