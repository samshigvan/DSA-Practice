class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int []output = new int[2];
        for(int i=0; i<nums.length; i++){
            if (nums[i]<target) {
                for(int j = i+1; j<nums.length; j++) {
                    if (i!=j && nums[i]+nums[j]==target) {
                        output[0] =i;
                        output[1] =j;
                    }
                }
            }
        }
        return output;
    }
}