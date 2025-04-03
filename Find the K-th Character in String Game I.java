class Solution {
    public static char next(char c){
if(c=='z')
return 'a';
return ++c;
    }
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<=k){
            int n=sb.length();
      for(int i=0;i<n;i++){
        sb.append(next(sb.charAt(i)));
      }
        }
        System.out.print(sb);
        return sb.charAt(k-1);
    }
}
