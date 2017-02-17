public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null) {
            return null;
        }
        int numslen = nums.length;
        if (numslen == 0) {
            return new ArrayList<Integer>(){};
        }
        boolean[] numbers = new boolean[numslen];
        for (int i = 0; i < numslen; i++) {
            System.out.println(nums[i]);
            numbers[nums[i] - 1] = true;
        }
        List<Integer> disappearedNumbers = new ArrayList<Integer>(numslen);
        for (int i = 0; i < numslen; i++) {
            if (!numbers[i]) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
