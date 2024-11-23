class Solution {
    public String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String reverseWords(String s) {
        String sa[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
for(int i=0;i<sa.length;i++){
    sb.append(rev(sa[i])).append(" ");
}
return sb.toString().trim();
    }
}
