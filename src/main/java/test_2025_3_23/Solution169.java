package test_2025_3_23;

import java.util.*;

class Solution169 {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
            if (map.get(num) > nums.length / 2 && map.get(num) > map.get(result)) result = num;
        }
        return result;
    }
    public int majorityElement2(int[] nums) {
        int count = 0;
        int tmp = nums[0];
        for (int num : nums) {
            if (tmp == num) count++;
            else count--;
            if (count == 0) {
                tmp = num;
                count = 1;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Solution169 solution = new Solution169();
        int[] nums = new int[]{1,2,2,1,2,2,1,1,1,1};
        System.out.println(solution.majorityElement2(nums));
    }
}