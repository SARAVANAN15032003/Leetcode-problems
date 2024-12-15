class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        String g="aeoiuAEIOU";
        int i=0,j=s.length()-1;
        while(i<j){
            while(!g.contains(s.charAt(i)+"")&&i<j){
                i++;
            }
            while(!g.contains(s.charAt(j)+"")&&i<j){
                j--;
            }
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,s.charAt(i));
            i++;j--;
        }
        return sb.toString();
    }
}
