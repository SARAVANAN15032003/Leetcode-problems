class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
           boolean b=true;
           for(int j=1;j<strs.length;j++){
            if(i<=strs[j].length()-1 && strs[j].charAt(i) == c){
                b=true;
                continue;
            }
            else{
                return sb.toString();
            }}
            if(b){
                sb.append(c+"");
            }
        }
         return sb.toString();
}}
