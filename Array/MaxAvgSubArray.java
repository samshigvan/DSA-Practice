class MaxAvgSubArray{

    public double findMaxAverage(int[] nums, int k) {
        int windowStart=0;
        int len=nums.length;
        int windowSum =0;
        double windowAvg = 0;
        double maxAvg = -100000.00;

        for(int windowEnd=0; windowEnd<=len-1; windowEnd++){
            windowSum = nums[windowEnd]+ windowSum ;

            if(windowEnd>=k-1){
                windowAvg = (double) windowSum /k;
                maxAvg = maxAvg<windowAvg? windowAvg: maxAvg;
                windowSum = windowSum-nums[windowStart];
                windowStart = windowStart+1;
            }
        }
        return maxAvg;
    }
}