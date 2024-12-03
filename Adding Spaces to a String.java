class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
        int j=0;
        for(int i:spaces){
            sb.insert(i+j++,' ');
        }
        return sb.toString();
    }
}
