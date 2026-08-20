class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s1=sort(strs[i]);

            if(!result.containsKey(s1)){
                result.put(s1,new ArrayList<>());
            }
            result.get(s1).add(strs[i]);
        }
        return new ArrayList<>(result.values());
    }
    static String sort(String s) {
        char[] ss1=s.toCharArray();

        Arrays.sort(ss1);
        return new String(ss1);
        
    }
}
