class Solution {
    public int percentageLetter(String s, char letter) {
     int c=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==letter)c++;
     }   
     return (int)Math.floor((double)c/s.length()*100.0);
    }
}
