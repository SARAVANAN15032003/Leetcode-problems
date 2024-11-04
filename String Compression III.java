class Solution {
    public String compressedString(String word) {
        int co=0;StringBuilder s2=new StringBuilder();
        char c=word.charAt(0);
        for(int i=0;i<word.length();i++){
     if(c==word.charAt(i)&&co!=9){
        co++;
        }
        else{
s2.append(co+"").append(c);
            co=1;
            c=word.charAt(i);
        }
        }
        s2.append(co+"").append(c);
        return s2.toString();
    }
}
