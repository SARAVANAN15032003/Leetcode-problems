class Solution {
    public boolean count(String s){
 String s1="qwertyuiop",s2="asdfghjkl",s3="zxcvbnm";
 int c1=0,c2=0,c3=0;
 for(int i=0;i<s.length();i++){
if(s1.contains(Character.toLowerCase(s.charAt(i))+""))c1++;
else if(s2.contains(Character.toLowerCase(s.charAt(i))+""))c2++;
else c3++;
 }
 return s.length()==c1||s.length()==c2||s.length()==c3;
    }
    public String[] findWords(String[] words) {
        int i=0,j=words.length-1;
        List<String> list=new ArrayList<>();
        while(i<words.length){
if(count(words[i]))list.add(words[i]);

i++;
        }
        return list.toArray(new String[0]);
    }
}
