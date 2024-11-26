class Solution {
    public boolean sym(String s){
       if(s.length()%2!=0)return false;
        int i=0,j=s.length()-1,l=0,r=0;
        while(i<j){
           
            l+=s.charAt(i)-'0';
            r+=s.charAt(j)-'0';
            i++;j--;

        }
        return l==r;

    }
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(sym(i+""))c++;
        }
        return c;
    }
}
