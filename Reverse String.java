class Solution {
    public void reverseString(char[] s) {
        int u=s.length-1;
        for(int i=0;i<u;i++,u--){
         
                char c=s[i];
                s[i]=s[u];
                s[u]=c;
          if(i==u)
          break;
        }
    }
}
