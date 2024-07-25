class TwoSum {
    public int[] twoSum(int[] nums,  int target) {
        int length = nums.length;
        for (int dif = 1; dif < length; dif++) {
            for (int right = dif; right < length; right++) {
                int left = right - dif;
                if (nums[left] + nums[right] == target) {
                    return new int[] {left, right};
                }
            }
        }
        return new int[0];
    }
}