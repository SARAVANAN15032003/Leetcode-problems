class Solution {
    public String reverseOnlyLetters(String s) {
     int i=0,j=s.length()-1;
     String h="";
     while(i<s.length()){
if(Character.isLetter(s.charAt(i))){
    if(Character.isLetter(s.charAt(j))){
    h=h+s.charAt(j);
    j--;
    i++;
    }
    else 
    j--;
    }
else{
    h=h+s.charAt(i);
    i++;}
     }   
     return h;
    }
}
