class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[5];
        int co=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
                 if(c=='b')arr[0]++;
            else if(c=='a')arr[1]++;
            else if(c=='l')arr[2]++;
            else if(c=='o')arr[3]++;
            else if(c=='n')arr[4]++;
        }
       arr[2]/=2;
       arr[3]/=2;
       Arrays.sort(arr);
       if(arr[0]==0)
       return 0;
       co=arr[0]; 
        return co;
    }
}
