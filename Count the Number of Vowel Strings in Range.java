class Solution {
    public boolean vow(String s){
String is="aeiou";
return is.contains(s.charAt(0)+"")&&is.contains(s.charAt(s.length()-1)+"");
    }
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            if(vow(words[i]))c++;
        }
        return c;
    }
}
