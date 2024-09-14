class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            boolean nextGreaterFound = false;
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            ans[i] = nums2[k];
                            nextGreaterFound = true;
                            break;
                        }
                    }
                    break;
                }
            }
            
            if (!nextGreaterFound) {
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}
