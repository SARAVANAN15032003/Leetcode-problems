class Solution {
    public String reverseWords(String s) {
        String s1[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int f=s1.length-1;f>=0;f--){
            sb.append(s1[f]).append(" ");
        }
        return sb.toString().trim();
    }
}
