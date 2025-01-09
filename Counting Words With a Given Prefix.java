class Solution {
    public int prefixCount(String[] words, String pref) {
       int co=0;
       for(int i=0;i<words.length;i++){
        if(words[i].indexOf(pref)==0)
        co++;
    }
return co;
    }
}
