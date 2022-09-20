public class Longest_Common_Subsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();
        int[][] dp = new int[array1.length + 1][array2.length + 1];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                dp[i + 1][j + 1] = array1[i] == array2[j] ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        return dp[array1.length][array2.length];
    }
    
}
