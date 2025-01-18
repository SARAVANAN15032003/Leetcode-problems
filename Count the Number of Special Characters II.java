class Solution {
    public int numberOfSpecialChars(String word) {
        List<Character> list=new ArrayList<>();
        int co=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c>='a' && c<='z'){
                 char up=Character.toUpperCase(c);
                 int ind=word.indexOf(up);
                 int n=word.indexOf(c,i+1);
                 if(!list.contains(c) && i<ind && n==-1)
                 co++;
        }
        }
        return co;//list.size();
    }
}
