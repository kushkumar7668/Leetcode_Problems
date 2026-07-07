class Solution {
    public String frequencySort(String s) {
        int[][] f = new int[62][2];
        int i =0 ;
        for(int[] a : f) a[0] = i++;
        for(char ch : s.toCharArray()){
           
            if(ch >= 'a' && ch <= 'z'){
                f[36 + ch-'a'][1]++;
            }
            else if(ch >= '0' && ch <= '9'){
                f[26 + ch-'0'][1]++;
            }
            else if(ch >= 'A' && ch <= 'Z') {
                f[ch - 'A'][1]++;
            }

            
        }

        Arrays.sort(f, (a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];   // Second column: descending
            }
            return a[0] - b[0];       // First column: ascending
        });

        for(int[] a : f){
            System.out.println(a[0] + " " +  a[1]);
        }
        StringBuilder sb = new StringBuilder();
        for(int[] a : f){
            char ch = 'a';
            if(a[0] <= 25)  ch = (char)('A' + a[0]);
            else if(a[0] >= 26 && a[0] <= 35) ch = (char)('0' + a[0] - 26);
            else  ch = (char)('a' + a[0] - 36);

            while(a[1] > 0){
                sb.append(ch);
                a[1]--;
            }  
        }
        return sb.toString();
    }
}