class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        boolean result = false;
        if(chs.length != cht.length){ 
            return false;
        }
        Arrays.sort(chs);
        Arrays.sort(cht);
        for(int i = 0;i<chs.length; i++){
            if(chs[i] == cht[i]){
                result = true;
            }
            else {
                return false;
            }
        }
        return result;
    }
}