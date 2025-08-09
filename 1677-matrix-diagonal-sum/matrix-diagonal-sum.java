class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        int count = 0;

        
        for(int i = 0;i<n;i++){
            count = count + mat[i][i];  
              
        }

        for(int i = 0 ; i<n/2;i++){
            count = count + mat[i][n-1-i] + mat[n-1-i][i];  
                   
        }

      return count; 
    }

}