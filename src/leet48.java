public class leet48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int rot = n/2;
        int cnt = n-1;

        for(int i=0; i<rot; i++){
            for(int j=0; j<cnt; j++){
                int temp = matrix[i][j+i];
                matrix[i][j+i] = matrix[n-1-j-i][i];
                matrix[n-1-j-i][i] = matrix[n-1-i][n-1-j-i];
                matrix[n-1-i][n-1-j-i] = matrix[j+i][n-1-i];
                matrix[j+i][n-1-i] = temp;
            }
            cnt-=2;
        }
    }
}
