class Solution {
    public boolean isavail(int arr[],int target){
        return Arrays.stream(arr).anyMatch(num -> num == target);
    }
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums[0].length;i++){
            int y=nums[0][i];
            System.out.print(y+" ");
            boolean b=true;
            for(int j=1;j<nums.length;j++){
                if(!isavail(nums[j],y)){
                 b=false;
                 break;
                 }
            }
            if(b)
                 list.add(y);
        }
        Collections.sort(list);
 return list;
    }
}
