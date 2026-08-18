class Solution {
    public int mySqrt(int x) {
        long start = 1;
        long end = x;
        long mid = 0;
        while(start <= end){
            mid = (start+end)/2;
            if(mid*mid == x) return (int)mid;
            else if (mid*mid > x) end = mid-1;
            else start = mid + 1;
        }
        return (int)end;
    }
}