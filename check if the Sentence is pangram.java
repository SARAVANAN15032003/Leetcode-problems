class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char w='a';w<='z';w++){
            if(!(sentence.contains(w+"")))return false;
        }
        return true;
    }
}
