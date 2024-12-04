class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            char s1 = str1.charAt(i);
            char s2 = str2.charAt(j);
            if (s1 == s2 || getNextChar(s1) == s2) {
                j++;
            }
            i++; 
            }

        return j == str2.length();
    }

    private char getNextChar(char c) {
        return c == 'z' ? 'a' : (char) (c + 1);
    }
}

// class Solution {
//     public boolean canMakeSubsequence(String str1, String str2) {
//         for(int i=0;i<str2.length();i++){
//             char h=str2.charAt(i);
//             if(!str1.substring(i).contains(h + "")){
//                char c=str2.charAt(i);
//               System.out.println(c);
//                if(c=='a')
//                c='z';
//                else
//                c--;
//                 System.out.println(c);
//                System.out.println(str1.indexOf(c,i));
//                 if(!str1.contains(c+"")||!(i<=str1.indexOf(c,i)))
//                 return false;
//             }
//             else{
//                 if(str1.length()==str2.length()){
//                     char c1=str2.charAt(i);
//               if(i!=str1.indexOf(c1,i))return false; 
//                 }
//             }
//         }
//         return true;
//     }
// }
