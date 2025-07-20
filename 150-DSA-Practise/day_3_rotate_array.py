https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

question desc: 
  - given an integer array and k
  - k denotes number of time array needs to be rotated right

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

approach 1:
  - just iterating k times and on each time of iteration, another loop is iterated from last to first, where last element is replaced with its previous element
  - but here time complexitiy is O(N∗K)

class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0; i<k; i++){
            int temp = nums[nums.length-1];
            for(int j = nums.length-1; j>0; j--){
                nums[j] = nums[j-1];
            }
            nums[0]= temp;
        }
    }
}

approach 2:
  - using temp array
  - test case to be considered: when k > nums.length

class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int c = 0;
        if(nums.length > k){
            for(int i = nums.length-k; i<nums.length; i++){
                temp[c] = nums[i];
                c++;
            }

            for(int i=0;i<nums.length-k;i++){
                temp[c]=nums[i];
                c++;
            }

            for(int i=0;i<temp.length;i++){
                nums[i]=temp[i];
            }
        }
        else{
            for(int i=0; i<k; i++){
                int temp1 = nums[nums.length-1];
                for(int j = nums.length-1; j>0; j--){
                    nums[j] = nums[j-1];
                }
                nums[0]= temp1;
            }
        }
    }
}
