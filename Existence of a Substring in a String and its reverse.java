class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String d=sb.toString();
        for(int i=0;i<s.length()-1;i++){
            if(d.contains(s.substring(i,i+2)))return true;
        }
        return false;
    }
}
