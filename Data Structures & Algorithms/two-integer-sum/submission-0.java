class Solution {
    public int[] twoSum(int[] nums, int target) {

        //brute force
        // nested for loop O(N^2)
        int correct[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int value = nums[i] + nums[j];
                if (value == target) {
                    correct[0] = i;
                    correct[1] = j;
                }                
            }
        }
        return correct;
    } 
}
