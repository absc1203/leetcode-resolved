class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] numsConcat = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            numsConcat[i] = nums[i];
            numsConcat[i + nums.length] = nums[i];
        }

        return numsConcat;
    }
}