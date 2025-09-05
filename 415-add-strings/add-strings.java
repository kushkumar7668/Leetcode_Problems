import java.math.BigInteger;

// class Solution {
//     // google bigInteger in java to know more ->
//     // this que can't be solved even with long.
//     public String addStrings(String num1, String num2) {
//         BigInteger no1 = new BigInteger(num1);
//         BigInteger no2 = new BigInteger(num2);
//         BigInteger sum = no1.add(no2);
//         return sum.toString();
//     }
// }

class Solution{
    public String addStrings(String num1, String num2){
        int l1 = num1.length(), l2 = num2.length();
        int i = l1-1, j = l2-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0 || carry !=0){
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int n = (digit1 + digit2 + carry);
            int entry = n%10;
            sb.append(entry);
            carry = n/10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}