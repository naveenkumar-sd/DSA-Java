class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        int r = rStart;
        int c = cStart;
        
        int dirIdx = 0;

        int steps = 1;

        List<int[]> ans = new ArrayList<>();

        ans.add(new int[]{r,c});

        while(ans.size()<rows*cols){

            for(int j = 0; j<2; j++){
                
                for(int i = 0; i<steps; i++){
                    r = r + directions[dirIdx][0];
                    c = c + directions[dirIdx][1];

                    if(0<=r && r<rows && 0<=c && c<cols){
                    
                        ans.add(new int[]{r,c});

                    }

                }
            
                dirIdx = (dirIdx+1) % 4;
            }

            steps++;
        }

        
       return ans.toArray(new int[rows*cols][2]);
    }
}