class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int  y=sb.indexOf(part),n=part.length();
        while(y!=-1){
            sb.delete(y,y+n);
             y=sb.indexOf(part);
        }
        return sb.toString();
    }
}
