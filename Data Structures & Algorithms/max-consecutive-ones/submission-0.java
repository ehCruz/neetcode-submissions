class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSeq = 0;
        int curSeq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curSeq++;
            } else {
                curSeq = 0;
            }
            maxSeq = Math.max(curSeq, maxSeq);
        }

        return maxSeq;
    }
}