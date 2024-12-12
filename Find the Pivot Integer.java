class Solution {
    public int pivotInteger(int n) {
        int tot=(n*(n+1))/2,l=0;
        for(int i=1;i<=n;i++){
if(l==tot-l-i)
return i;
l+=i;
        }
 return -1;
    }
}
