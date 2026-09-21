class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int multiple = 1;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int x = 26 - (c - 'a');
            ans = ans + (x * multiple);
            multiple++;
        }
        return ans;
    }
}