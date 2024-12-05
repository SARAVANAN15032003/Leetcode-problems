class Solution {
    public int countKeyChanges(String s) {
        int co=0;
        char c=s.charAt(0);
        for(int i=1;i<s.length();i++){
if(c!=Character.toLowerCase(s.charAt(i))&&c!=Character.toUpperCase(s.charAt(i))){
       co++;
       c=s.charAt(i);}
        }
        return co;
    }
}
