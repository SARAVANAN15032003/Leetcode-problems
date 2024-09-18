// class Solution {
//     public boolean validPalindrome(String s) {
//      StringBuilder str=new StringBuilder(s);
//     String d=s;int p=s.length()-1;
//     String k=s;int l=0;
//      while(l<s.length()){
//         if(ispal(d)||ispal(k))
//         return true;
//         else{
//             str.deleteCharAt(l++);
//             d=str.toString();
//             str=new StringBuilder(s);
//             str.deleteCharAt(p--);
//         k=str.toString();
//         str=new StringBuilder(s);
//         }
//      }   
//      return false;
//     }
//     public static boolean ispal(String s){
//         int j=s.length()-1;
//         int i=0;
//         while(i<j){
//             if(s.charAt(i)==s.charAt(j)){
//                 i++;j--;continue;
//             }else
//         return false;

//         }
//         return true;
//     }
// }
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
        return ispal(s, left + 1, right) || ispal(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true; 
    }

    
    private boolean ispal(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
