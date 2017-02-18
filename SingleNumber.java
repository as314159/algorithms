public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int numslen = nums.length;
        if (numslen == 0) {
            return 0;
        }
        Map<Integer, Integer> numbersCount = new LinkedHashMap<Integer, Integer>(numslen);
        for (int i = 0; i < numslen; i++) {
            if (numbersCount.containsKey(nums[i])) {
                numbersCount.put(nums[i], 2);
            } else {
                numbersCount.put(nums[i], 1);
            }
        }
        int duplicate = 0;
        for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
            if (entry.getValue() == 1) {
                duplicate = entry.getKey();
            }
        }
        return duplicate;
    }
}
