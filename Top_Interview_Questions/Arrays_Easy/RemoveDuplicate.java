package Top_Interview_Questions.Arrays_Easy;

class Duplicates {
    /**
     * Problem: Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     * 
     * i.e. [1, 1, 2] will be modified to [1, 2, 1] and function returns 2. (Everything after the returned length of the modified array will be ignored)
     * @param nums sorted array of int which may or may not have duplicate numbers
     * @return length of the non-duplicate array
     */
    static public int removeDuplicates(int[] nums) {
        int position = 0;
        for (int i = 1; i < nums.length; i++) {
            // don't need to swap elements neccessarly, works also with just `nums[++position] = nums[i]`
            if (nums[i] != nums[position]) {
                int tmp = nums[i];
                nums[i] = nums[position + 1];
                nums[position + 1] = tmp;
                position++;
            }
        }
        return position + 1;
    }
}