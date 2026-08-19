class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        char[] ss1=s.toCharArray();
        char[] tt2=t.toCharArray();

        Arrays.sort(ss1);
        Arrays.sort(tt2);

        return Arrays.equals(ss1,tt2);
    }
}
