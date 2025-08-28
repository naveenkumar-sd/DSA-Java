class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        if(m<0 && n<0){
            return false;
        }

        int start = 0; 
        int end = (m*n)-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int r=mid/n;
            int c=mid%n;

            if(matrix[r][c] == target){
                return true;
            }else if(target<matrix[r][c]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return false;

    }
}