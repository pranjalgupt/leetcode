class Solution {
    public int kthFactor(int n, int k) {
        int len = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                len += 1;
            }
            if(len == k) {
                return i;
            }
        }
        return -1;
    }
}