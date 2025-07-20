https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

Question: 
  - In short, input array is a sorted array in ascending order, we need to remove the duplicate numbers from the array, without using extra array ie memory should be in O(n)
  - We need to arrange in same array and return the k where first k elements in the input array contains the non-duplicate elements
  - Here, the array can have atmost 2 deuplicate numbers such that 1,1 is fine and 1,1,1 is not acceptable
  - So if input array = [1,1,2,2,2,3,3] output = [1,1,2,2,3,3,_,_] and return k = 6

Approach 1[failed test cases not a proper approach]:
  - two pointers - i,j where i starts with 0 and j starts with i+1
  - j pointer is moved until the nums[j] != nums[i]
  - cnt is increemented for each nums[j] value matching with nums[i] value
  - when the cnt is greater than 2, then subarray from nums[i+2] to nums[j-1] is replaced with nums[j] value
  - But my approach, works if cnt is greater than 2, but fails in case the number exist only once (for eg: [1,1,2,3,3])

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i+1;
        while(i<nums.length && j<nums.length){
            int cnt = 1;
            if(nums[i] == nums[j]){
                while(j <  nums.length && nums[j] == nums[i]){
                    j++;
                    cnt++;
                }
                if(cnt > 2){
                    for(int k = i+2; k < j; k++){
                        if(k < nums.length && j < nums.length){
                            nums[k] = nums[j];
                        }
                    }
                    i=j-1;
                }
            }else{
                i++;
                j++;
            }
        }
        return i;
    }
}

Approach 2:
  - count and fill approach
  - i[left pointer] and j[right pointer] starts from 0 index
  - nums[j] is compared with its nums[j+1] value and cnt = number of nums[i] occurance
  - once the count is calculated, with the count, from nums[i] till the len of count, the value is replaced

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length){
            int cnt = 1;
            while(j+1 < nums.length && nums[j] == nums[j+1]){
                j++;
                cnt++;
            }

            int min = Math.min(2,cnt);
            System.out.println(min);
            for(int k=0;k<min;k++){
                if(j < nums.length && i < nums.length)
                    nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
        
    }
}
