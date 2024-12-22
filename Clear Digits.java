class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder();
        while(!sb.toString().equals(sb1.toString())){
for(int i=0;i<sb.length();i++){
    if(Character.isLetter(sb.charAt(i))){
        sb1.append(sb.charAt(i));
    }
    else{
        sb1.deleteCharAt(sb1.length()-1);
    }
}
sb=new StringBuilder(sb1.toString());
        }
        return sb1.toString();
    }
}
