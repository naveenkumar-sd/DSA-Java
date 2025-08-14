class Solution {
    public int[][] generateMatrix(int n) {
        
        int val = 1;
        int[][] arr = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        while(rowBegin <= rowEnd && colBegin <= colEnd){

            for(int j = colBegin; j <= colEnd; j++){
                arr[rowBegin][j] = val++;
            }
            rowBegin++;

            for(int j = rowBegin; j<= rowEnd ; j++){
                arr[j][colEnd] = val++;
            }
            colEnd--;

            for(int j = colEnd; j>=colBegin;j--){
                arr[rowEnd][j] = val++;
            }

            rowEnd --;

            for(int j = rowEnd; j>=rowBegin; j--){
                arr[j][colBegin] = val++;
            }

            colBegin++;

        }

        return arr;

    }
}