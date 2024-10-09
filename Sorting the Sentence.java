class Solution {
    public String sortSentence(String s) {
          String h[]=s.split(" ");String o="";
         String k[]=new String[h.length];
         StringBuilder sb=new StringBuilder();
         for (int i = 0; i <h.length; i++) {
             k[(h[i].charAt(h[i].length()-1)-'0')-1]=h[i];
         }
         for (String string : k) {
             sb.append(o + string.substring(0, string.length() - 1));
             o = " ";
         }
return sb.toString();
    }
}
