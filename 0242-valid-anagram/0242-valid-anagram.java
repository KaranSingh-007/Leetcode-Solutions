class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        boolean result = false;
        if(s.length() != t.length()) return false;
        Arrays.sort(chs);
        Arrays.sort(cht);
        for(int i = 0; i<s.length(); i++){
            if(chs[i] != cht[i]) return false;
            else {
                result = true;
            }
        }
        return result;
    }
}