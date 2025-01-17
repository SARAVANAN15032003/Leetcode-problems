class Solution {
    public boolean doesValidArrayExist(int[] derived) {
       int n=derived.length;
       int org[]=new int[n];
       for(int i=1;i<n;i++){
        org[i]=derived[i-1]^org[i-1];
       }
       int in=0;
       for(int i=0;i<n;i++){
if(i==n-1)
in=0;
else
in=i+1;
        if(derived[i]!=(org[i]^org[in]))
        return false;
       }
       return true;
    }
}
