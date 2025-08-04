class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0,len=columnTitle.length()-1;
        for(char c:columnTitle.toCharArray()){
            result+=((int)(c-'A')+1)*Math.pow(26,len--);
        }
return result;
    }
}
