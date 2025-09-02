class Solution {
    public boolean judgeCircle(String moves) {
        
        int n = moves.length();
        int U=0,D=0,L=0,R=0;

        if(n%2 == 1){
            return false;
        }

        for(int i = 0; i<n;i++){
            char val = moves.charAt(i);
            switch(val){
                case 'U':
                    U++;
                    break;
                case 'D':
                    D++;
                    break;
                case 'L':
                    L++;
                    break;
                default:
                    R++;
                    break;

            }

        }

          if(L == R && U == D) {
                return true;
            }else{
                return false;
            }
            
    
    }
}