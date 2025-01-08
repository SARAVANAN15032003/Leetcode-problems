class Solution {
    public boolean isPrefixAndSuffix(String s,String p){
  if(s.length()>p.length())return false;
  int y=s.length(),n=p.length()-y;
  return p.substring(0,y).equals(s) && p.substring(n).equals(s);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int co=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j]))
                co++;
            }
        }
        return co;
    }
}
