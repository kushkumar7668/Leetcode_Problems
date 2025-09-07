class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int[] res=new int[m+n];

        for(int i= m-1;i>=0;i--){
            int d1 =num1.charAt(i)-'0';
            for(int j=n-1;j>=0;j--){
                int d2 =num2.charAt(j) -'0';
                int mul =d1*d2;
                int p1 =i+j;     //stores carry/ 10th place
                int p2 = i+j+1;  // atores product's unit digit 
                int sum =mul+res[p2];
                res[p2] =sum%10;
                res[p1] +=sum/10;
            }
        }
        StringBuilder sb =new StringBuilder();
        for(int num: res){
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num);
            }
        }
        return sb.length() == 0 ? "0" :sb.toString();
    }
}







/*
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        String[] arr = new String[num1.length()];
        int k = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            int carry = 0;
            int d1 = num1.charAt(i) - '0';

            for (int j = num2.length() - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int x = d1 * d2 + carry;
                sb.append(x % 10);
                carry = x / 10;
            }
            if (carry > 0) sb.append(carry);

            sb.reverse();
            // add trailing zeros for place value
            for (int z = 0; z < (num1.length() - 1 - i); z++) {
                sb.append("0");
            }

            arr[k++] = sb.toString();
        }

        String ans = "0";
        for (int i = 0; i < k; i++) {
            ans = addStrings(ans, arr[i]);
        }
        return ans;
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int d1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int d2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = d1 + d2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}


*/







