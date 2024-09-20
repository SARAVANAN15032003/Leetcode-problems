class Solution {
    public int firstUniqChar(String s) {
for(int i=0;i<s.length();i++){
    boolean t=true;
    char c=s.charAt(i);
    for(int j=0;j<s.length();j++){
if(i!=j){
if(c==s.charAt(j)){
t=false;
break;}
    }}
    if(t)
    return s.indexOf(c);
}
        return -1;
    }
}
