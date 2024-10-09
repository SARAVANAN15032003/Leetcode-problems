class Solution {
    public boolean isNumber(String s) {
       
           try{
            double t=Double.parseDouble(s);
            
        }catch(Exception e){
return false;
        }
        if(s.equals("Infinity")||s.equals("+Infinity")||s.equals("-Infinity")||(s.charAt(s.length()-1)>='a'&&s.charAt(s.length()-1)<='z')||(s.charAt(s.length()-1)>='A'&&s.charAt(s.length()-1)<='Z'))
        return false;
        return true;
    }
}
