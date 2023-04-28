class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int countInS = 0;
        int countInT = 0;
        
        while(true){
            while(i >= 0){
                if(S.charAt(i) == '#'){
                    countInS++;
                    i--;
                }
                else if(countInS > 0){
                    countInS--;
                    i--;
                }
                else{
                    break;
                }
            }
            while(j >= 0){
                if(T.charAt(j) == '#'){
                    countInT++;
                    j--;
                }
                else if(countInT > 0){
                    countInT--;
                    j--;
                }
                else{
                    break;
                }
            }
            if (i >= 0 && j >= 0){ 
                if(S.charAt(i) == T.charAt(j)) {
                    i--;
                    j--;
                } 
                else {
                    return false;
                }
            }
            else{ 
                break;
            }
        }
        return (i == j) ? true : false;
    }
}