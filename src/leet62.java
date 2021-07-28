public class leet62 {
    static int map[][];
    public int uniquePaths(int m, int n) {
        map= new int[m][n];
        for(int i=0; i<m; i++){
            map[i][0] = 1;
        }
        for(int i=0; i<n; i++){
            map[0][i] = 1;
        }
        return func(m-1,n-1);
    }
    public int func(int m, int n){
        if(map[m][n] == 0)
            map[m][n] = func(m,n-1) + func(m-1,n);
        return map[m][n];
    }
}
