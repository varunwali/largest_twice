class Solution {
    public int dominantIndex(int[] nums) {
        int largestNumber = Integer.MIN_VALUE, secondLargestNumber = Integer.MIN_VALUE;
        int largestNumberIndex = -1;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = nums[index];
                largestNumberIndex = index;
            } else if (nums[index] > secondLargestNumber) {
                secondLargestNumber = nums[index];
            }
        }
        return largestNumber >= secondLargestNumber * 2 ? largestNumberIndex : -1;
    }
}

