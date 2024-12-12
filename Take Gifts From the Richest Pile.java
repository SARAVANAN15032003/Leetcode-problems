class Solution {
    public long pickGifts(int[] gifts, int k) {
     long sum=0;
     int n=gifts.length-1;
     for(int i=0;i<k;i++){
Arrays.sort(gifts);
gifts[n]=(int)Math.sqrt(gifts[n]);
     }   
     for(int i:gifts)sum+=(int)i;
     return sum;
    }
}
