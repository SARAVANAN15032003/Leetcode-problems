class Solution {
    public boolean isValid(String word) {
String vowel="aeiouAEOIU",spe = "!@#$%^&*()_+-=[]{};':\"|,.<>/?";
        if(word.length()<3)return false;
        boolean v=false,c=false,sp=true;
        for(int i=0;i<word.length();i++){
            if(vowel.contains(word.charAt(i)+"")){v=true;}
if(Character.isLetter(word.charAt(i))&&!(vowel.contains(word.charAt(i)+""))){c=true;}
if(spe.contains(word.charAt(i)+"")){sp=false;}
        }

        return ((c&&v)&&(sp));
        }
    }
