class Solution {
    public int commonFactors(int a, int b) {
        int li=a<b?a:b;
        int co=0;
        for(int i=1;i<=li;i++){
         if(a%i==0&&b%i==0)
         co++;
        }
        return co;
    }
}
