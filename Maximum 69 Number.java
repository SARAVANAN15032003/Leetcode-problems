class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder(num+"");
        int max=num;
        for(int i=0;i<sb.length();i++){
if(sb.charAt(i)=='6'){
String s=sb.toString();
sb.setCharAt(i,'9');
int m=Integer.parseInt(sb.toString());
if(max<m){
    max=m;
}
sb=new StringBuilder(s);
}
 }
      return max;
    }
}
