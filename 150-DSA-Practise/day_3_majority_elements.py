https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maj = nums.length/2;
        int j = 0;
        while(j < nums.length){
            int cnt = 1;
            while(j+1 < nums.length && nums[j] == nums[j+1]){
                j++;
                cnt ++;
            }
            if(cnt > maj){
                return nums[j];
            }
            j++;
        }
        return 0;
    }
}
