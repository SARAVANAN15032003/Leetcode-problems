class Solution {
    public boolean pali(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))return false;
        }
        return true;
    } 
    public boolean isStrictlyPalindromic(int n) {
        int l=n-2;
        for(int i=2;i<=l;i++){
            if(!pali(Integer.toString(n,i)))return false; 
        }
        return true;
    }
}
