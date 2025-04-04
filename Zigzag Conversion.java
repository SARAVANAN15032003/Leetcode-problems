class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder sb=new StringBuilder();
        String sa[]=new String[numRows];
        int j=0,k=0,i=0;
       while(i<s.length()){
while(j<sa.length && i<s.length()){
    if (sa[j] == null) {
        sa[j] = "";
    }
    sa[j]+=s.charAt(i)+"";
    j++;i++;
}
j=1;
k=sa.length-2;
while(k>=0 && i<s.length()){
    sa[k]+=s.charAt(i)+"";
    k--;i++;
}
       }
        for(String d:sa){
         if(d!=null)
         sb.append(d);
         }
        return sb.toString();
    }
}
