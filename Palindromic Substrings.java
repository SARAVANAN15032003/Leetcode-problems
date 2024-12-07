class Solution {
    public boolean pali(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))
            return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int co=0;
        for(int i=0;i<s.length()-1;i++){
           boolean b=true;
           int j=s.length()-1;
            do{
                if(b){
                if(pali(s.substring(i)))
                co++;    
                    b=false;
                }
                else{
                if(pali(s.substring(i,j--)))
                co++;
               
             }
        }while(j>i);
        }
        return co+1;
    }
}
