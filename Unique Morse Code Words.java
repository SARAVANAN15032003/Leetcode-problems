class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String> list=new ArrayList<>();
        String s[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int co=0;
        StringBuilder sb2=new StringBuilder();
        for(String d:words){
              for(char c:d.toCharArray()){
                    sb2.append(s[c-'a']);
                }
                String r=sb2.toString();
sb2.setLength(0);
if(!list.contains(r))
co++;
list.add(r);
        }
        return co;
    }
}
