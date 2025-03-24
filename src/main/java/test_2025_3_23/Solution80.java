package test_2025_3_23;

class Solution80 {
    // [1,1,1,2,2,2,2,3]
    public int removeDuplicates(int[] nums) {
        int p = 0;
        int tmp = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == tmp) count++;
            else {
                count = 1;
                tmp = nums[i];
            }
            if (count < 3) nums[p++] = nums[i];
        }
        return p;
    }
}