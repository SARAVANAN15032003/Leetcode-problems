class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        String let[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        while(columnNumber>0){
columnNumber--;
sb.append(let[columnNumber%26]);
columnNumber/=26;
        }                   
        return sb.reverse().toString();
    }
}
