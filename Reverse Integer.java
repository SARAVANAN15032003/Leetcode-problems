class Solution {
    public int reverse(int x) {
       long j=(long)x;
        long k = 0, l = 0;
        while (j != 0) {
            l = j % 10;
            k = (k * 10) + l;
            j = j / 10;
        }
        if(k>Integer.MAX_VALUE||k<Integer.MIN_VALUE)
        {return 0;}
        return (int)k;
    }
}
