class Solution {
    public void rotate(int[][] mat) {
  
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int j = 0;
            int k = mat[i].length - 1;

            while (j < k) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;

                j++;
                k--;
            }
        }
    }
}