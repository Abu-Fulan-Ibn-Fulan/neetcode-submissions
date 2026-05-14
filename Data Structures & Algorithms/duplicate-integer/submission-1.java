class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        if (nums.length != numbers.size()) {
            return true;
        }

        return false;
    }
}