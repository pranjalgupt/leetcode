class Solution {
    public int diagonalSum(int[][] mat) {
    int n = mat.length;
    int primarySum = 0, secondarySum = 0;
    for (int i = 0; i < n; i++) {
        primarySum += mat[i][i];
        secondarySum += mat[i][n-1-i];
    }
    if (n % 2 == 1) {
        int mid = n / 2;
        secondarySum -= mat[mid][mid];
    }
    return primarySum + secondarySum;
}
}