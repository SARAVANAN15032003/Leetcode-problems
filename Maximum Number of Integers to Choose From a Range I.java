class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int co=0,l=0;
     Set<Integer> set = new HashSet<>();
      for(int i:banned)set.add(i);
for(int i=1;i<=n;i++){
    if(!set.contains(i))
    {
        l+=i;
if(l<=maxSum){
co++;}
else 
break;
    }
}
return co;
    }
}
