class Solution {
    public static boolean isvowel(char c){
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
         return true;
    return false;
    }
    public String reverseVowels(String s) {
    String s2="";    
    String s1="";
        for(int i=0;i<s.length();i++){
           if(isvowel(s.charAt(i)))
            s1=s.charAt(i)+""+s1;
        }int j=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i)))
           s2=s2+s1.charAt(j++)+"";
           else 
           s2=s2+s.charAt(i);
        }
        return s2;
    }
}
