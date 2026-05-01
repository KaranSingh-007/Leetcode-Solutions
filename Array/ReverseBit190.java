class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int bitMask = 1;

        for (int i = 0; i < 32; i++) {
            if ((bitMask & n) != 0) {
                ans |= (1 << (31 - i));
            }
            bitMask <<= 1;
        }

        return ans;
    }
}