class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a = s1.toCharArray(), b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int more = 0, less = 0;
        for (int i = 0; i < a.length; i++) {
            int diff = a[i] - b[i];
            if (diff >= 0) more++;
            if (diff <= 0) less++;
        }
        return more == a.length || less == a.length;
    }
}