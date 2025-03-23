package test_2025_3_23;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                nums[++p] = nums[i];
            }
        }
        return p + 1;
    }
}