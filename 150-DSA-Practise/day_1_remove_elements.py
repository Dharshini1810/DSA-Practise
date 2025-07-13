https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int k = 0;

        while(i <= j && i>=0 && j>=0){
            if(nums[i] == val){
                while(j>=0 && nums[j] == val){
                    nums[j] = -1;
                    j--;
                    
                }
                if(j >= 0 && i <= j){
                    nums[i] = nums[j];
                    nums[j] = -1;
                }
                j--;
            }
            i++;
        }
        // System.out.println(nums.toString());
        for(int c=0;c<nums.length;c++){
            if(nums[c] != -1){
                k++;
            }
        }
        return k;
    }
}
