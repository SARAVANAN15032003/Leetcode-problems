class Solution {
    public boolean isPalindrome(String s) {
        //int i=0,j=s.length()-1;
//     String l="",u="";
//         while(i<s.length()){
// if(Character.isLetterOrDigit(s.charAt(i))){

// l=l+Character.toLowerCase(s.charAt(i))+"";
//     i++;
// }
// else{
//     i++;
// }
// if(Character.isLetterOrDigit(s.charAt(j))){
// u=u+Character.toLowerCase(s.charAt(j));
// j--;
// }
// else
// {
//     j--;
// }
            
//         }
//         System.out.println(l);
//         System.out.println(u);
//    return l.equals(u);
    
// }}  
        int i = 0, j = s.length() - 1;

        while (i <= j) {
           
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
        }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

                   i++;
            j--;
        }

        return true; 
    }}
