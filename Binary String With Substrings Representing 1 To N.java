class Solution {
    public boolean queryString(String s, int n) {
   for (int i=1;i<=n;i++){
    String q=Integer.toBinaryString(i);
    int j=0;
    while(q.charAt(j)=='0'){
        j++;
    }
if(!s.contains(q.substring(j)))
   return false;
   } 
   return true;   
    }
}
