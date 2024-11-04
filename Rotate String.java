class Solution {
    public String shift(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++){
            sb.append(s.charAt(i)+"");
        }
        sb.append(s.charAt(0)+"");
        return sb.toString();
    }
    public boolean rotateString(String s, String goal) {
      for(int i=0;i<s.length();i++){
        if(goal.equals(s))
        return true;
        else
        s=shift(s);
      }
      return false;
    }
}
