class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        //   if(ruleKey.equals("type")){
        //     return 0;
        // }else if(ruleKey.equals("color")){
        //     return 1;
        // }else if(ruleKey.equals("name")){
        //     return 2;
        // }else{
        //     return -1;
        // }

        if(ruleKey.equals("type")){
            return pingme(items,0,ruleValue);
        }else if(ruleKey.equals("color")){
            return pingme(items,1,ruleValue);
        }else{
            return pingme(items,2,ruleValue);
        }

    }

    static int pingme(List<List<String>> items,int index,String value){

        int n = items.size();
        int count = 0;

        for(int i = 0;i<n;i++ ){
                if((items.get(i).get(index)).equals(value)){
                    count = count+1;
                }
        }

        return count;
    }
}