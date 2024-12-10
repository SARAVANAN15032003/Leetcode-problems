class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int remainder = 0;
        for (int length = 1; length <= k; length++) {
            remainder = (remainder * 10 + 1) % k;
            if (remainder == 0) return length;
        }
        return -1;
    }
}

// import java.math.BigInteger;
// class Solution {
//     public int smallestRepunitDivByK(int k) {
//       if(k%2==0||k%5==0)
//       return -1;
//       StringBuilder sb=new StringBuilder();
// for(int i=0;i<k;i++){
//  sb.append("1");
//     String s=sb.toString();
//     BigInteger bigInt = new BigInteger(s);
//     if( bigInt.mod(BigInteger.valueOf(k)).equals(BigInteger.ZERO))
//     return i+1;

// }
//         return -1; 
//     }
// }
