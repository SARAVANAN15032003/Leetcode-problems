class Solution {
    public boolean prime(int num){
if (num <= 1) 
return false;
        if (num == 2 || num == 3)
         return true;
        if (num % 2 == 0 || num % 3 == 0) 
        return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean bits(int n){
// String s=Integer.toBinaryString(n);
// int c=0;
// for(int i=0;i<s.length();i++){
//     if(s.charAt(i)=='1')
//     c++;
//}
int c=Integer.bitCount(n);
return prime(c);
    }
    public int countPrimeSetBits(int left, int right) {
        int co=0;
        for(int i=left;i<=right;i++){
            if(bits(i)){
            co++;
            }
        }
        return co;
    }
}
