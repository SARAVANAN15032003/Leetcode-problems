class Solution {
    public int arrangeCoins(int n) {
      int c=0;
      for(int i=1;i<=n;i++){
        n=n-i;
        if(n>=0)
        c++;
      }  
      return c;
    }
}
