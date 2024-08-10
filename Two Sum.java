class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i] + nums[j];
                if (a == target) {
                    System.out.printf("We return [%d, %d]%n", nums[i], nums[j]);
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {}; // Return an empty array if no solution is found
    }

    
}
