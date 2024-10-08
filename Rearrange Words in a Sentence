class Solution {
    public String arrangeWords(String text) {
        String s[]=text.split(" ");
        Arrays.sort(s, Comparator.comparingInt(String::length));
String f="",o="";
for(String h:s){
f=f+o+h;o=" ";}
StringBuilder sb=new StringBuilder(f.toLowerCase());
sb.setCharAt(0,Character.toUpperCase(f.charAt(0)));
return sb.toString();
    }
}
