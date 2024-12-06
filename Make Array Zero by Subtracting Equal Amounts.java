// class Solution {
//     public int minimumOperations(int[] nums) {
//         int  co=0;
//         int n=nums.length-1;
//         Arrays.sort(nums);
//         while(nums[n]!=0){
//         int d=0;
//         for(int i=0;i<=n;i++){
//             if(nums[i]!=0){
//             d=nums[i];
//             break;}
//         }
//         for(int i=0;i<=n;i++){
//             if(nums[i]!=0){
//                 nums[i]-=d;
//             }
//         }
//         co++;
//         Arrays.sort(nums);
//         }
//         return co;
//     }
// }
class Solution {
    public int minimumOperations(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i)&&i!=0)
            list.add(i);
        }
    return list.size();
    }
}
