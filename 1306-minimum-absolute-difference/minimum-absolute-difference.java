class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i =1; i<arr.length; i++){
            mindiff = Math.min(mindiff, Math.abs(arr[i] - arr[i-1]));
        }
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0; i< arr.length - 1; i++){
            if(Math.abs(arr[i] - arr[i+1]) == mindiff){
                ll.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
    return ll;
    }
}