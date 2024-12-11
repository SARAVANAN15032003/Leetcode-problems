class Solution {
    public boolean is(String s1,String s2,String y){
        String sa1[]=s1.split(y);
        String sa2[]=s2.split(y);
        return sa1.length==0&&sa2.length==0;
    }
    public String gcdOfStrings(String str1, String str2) {
       StringBuilder sb=new StringBuilder();
       int i=0;String s="";
       while(i<str1.length()&&i<str2.length()){
        sb.append(str2.charAt(i));
        if(is(str1,str2,sb.toString())){
            if(s.length()<sb.length())
            s=sb.toString();}
        i++;
       }
       return s; 
    }
}
