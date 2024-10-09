class Solution {
    public int getLucky(String s, int k) {
       String j="";
        for(int i=0;i<s.length();i++){
j=j+(int)(s.charAt(i)-96)+"";
        }
int c=0;
       for(int i=0;i<k;i++){
       c=0;
        for(int p=0;p<j.length();p++){
c+=j.charAt(p)-'0';
        }
        j=c+"";
         }
return c;
    }
}
