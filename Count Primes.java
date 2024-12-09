class Solution {
    public int countPrimes(int n) {
        int co=0;
        boolean arr[]=new boolean[n];
        for(int i=2;i<n;i++){
            if(!arr[i]){
            co++;
            for(int j=i*2;j<n;j+=i){
                arr[j]=true;
            }
        }
     }
        return co;
    }
}
