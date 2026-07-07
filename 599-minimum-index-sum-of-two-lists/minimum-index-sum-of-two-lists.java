class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Set<String> set = new HashSet<>();
        for(String s : list2) set.add(s);
        HashMap<String, Integer> map1 = new HashMap<>();
        int i = 0;
        for(String s : list1){
            map1.put(s, i++);
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        int idx = 0;
        for(String s : list2){
            map2.put(s, idx++);
        }

        List<String> ans = new ArrayList<>();
        idx = 0;
        int sum = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for(String s : map1.keySet()){
            if(set.contains(s)){
                sum = map1.get(s) + map2.get(s);
                min = Math.min(min, sum);
                
            }
        }
        
        for(String s : map1.keySet()){
            if(set.contains(s) && map1.get(s) + map2.get(s) == min) ans.add(s);
        }
        String[] arr = ans.toArray(new String[0]);
        return arr;
    }
}