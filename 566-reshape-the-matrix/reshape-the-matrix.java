class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c ) return mat;

        int[][] ans = new int[r][c];
        List<Integer> dummy = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0; j<mat[i].length;j++){
                dummy.add(mat[i][j]);
            }
        }

        int count = 0;
        for(int i = 0 ;i< r; i++){
            for(int j = 0 ; j < c; j++){
                ans[i][j] = dummy.get(count);
                count++;
            }
        }

        return ans;

    }
}