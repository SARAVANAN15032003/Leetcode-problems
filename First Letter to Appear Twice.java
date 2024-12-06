class Solution {
    public char repeatedCharacter(String s) {
        int arr[]=new int[26];
        
        for(char c:s.toCharArray()){
            if(arr[c-'a']>0)return c;
            arr[c-'a']++;
        }
        return ' ';
    }
}
