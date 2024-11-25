class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> list=new ArrayList<>();
       Set<Integer> s1=new HashSet<>();
       for(int i:nums1)s1.add(i);
       Set<Integer> s2=new HashSet<>();
        for(int i:nums2)s2.add(i);
       ArrayList<Integer> li1=new ArrayList<>();
       ArrayList<Integer> li2=new ArrayList<>();
for(int i:s1){if(!s2.contains(i))li1.add(i);}
for(int i:s2){if(!s1.contains(i))li2.add(i);}
list.add(li1);
list.add(li2);
return list;
    }
}
