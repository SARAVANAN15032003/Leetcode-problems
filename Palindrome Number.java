class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        String str2="";
        for(int i=0;i<str.length();i++){
char c=str.charAt(i);
 str2=c+str2;       
        }
       System.out.print(str2);
        if(str.equals(str2))
        return true;
        else 
        return false;
    }
}
