class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<2)return false;
        boolean in=false,de=false;
        int i=0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
            in=true;
            else if(arr[i]==arr[i+1])
            return false;
            else
            break;
        }
        //System.out.print(i);
        for(int j=i;j<arr.length-1;j++){
             if(arr[j]>arr[j+1])
            de=true;
            else if(arr[j]==arr[j+1])
            return false;
            else
            return false;;
        }
        return in==de;
    }
}
