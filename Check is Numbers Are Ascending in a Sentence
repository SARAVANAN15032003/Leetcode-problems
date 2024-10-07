class Solution {
    public boolean areNumbersAscending(String s) {
        String str[]=s.split(" ");
        int ma=0;
        for(String st:str){
            try{
                int ss=Integer.parseInt(st);
                if(ss>ma)ma=ss;
                else return false;
            }catch(Exception e){
                continue;
            }
        }
        return true;
    }
}
