class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char x = 'a'; x <= 'z'; x++){
            if(sentence.indexOf(x) == -1){
                return false;
            }
        }
        return true;
    }
}