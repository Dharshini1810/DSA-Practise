26. Remove Duplicates from Sorted Array
https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i+1;
        if(nums.length == 1){
            return 1;
        }
        while(i < nums.length && j < nums.length){
            while((i < nums.length && j < nums.length) && (nums[i] == nums[j])){
                j++;
            }
            if((i < nums.length && j < nums.length)){
                nums[i+1] = nums[j];
            }
            i++;
        }

        return i;
    }
}
