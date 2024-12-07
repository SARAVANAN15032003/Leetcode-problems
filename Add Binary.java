import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
      BigInteger decimal1 = new BigInteger(a, 2);
      BigInteger decimal2 = new BigInteger(b, 2);
       BigInteger sum = decimal1.add(decimal2);
        return sum.toString(2);
    }
}
