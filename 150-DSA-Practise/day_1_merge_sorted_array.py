https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length-1;
        int i = m-1; 
        int j = n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[l] = nums1[i];
                l--;
                i--;
            }
            else if(nums1[i] < nums2[j]){
                nums1[l] = nums2[j];
                l--;
                j--;
            }
            else if(nums1[i] == nums2[j]){
                nums1[l] = nums1[i];
                l--;
                nums1[l] = nums2[j];
                l--;
                i--;
                j--;
            }
        }

        if(i >= 0){
            for(int k=i;k>=0;k--){
                nums1[l] = nums1[k];
                l--;
            }
        }
        if(j >= 0){
            for(int k1=j;k1>=0;k1--){
                nums1[l] = nums2[k1];
                l--;
            }
        }

    }
}
