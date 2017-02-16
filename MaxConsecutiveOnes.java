public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxconsecutiveones = 0;
        int len = nums.length;
        if (nums == null || len == 0) {
            return maxconsecutiveones;
        } else if (len == 1) {
            return nums[0];
        }
        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                int currentmaxconsecutiveones = 1;
                for (int j = i + 1; j < len; j++) {
                    if (nums[i] != nums[j]) {
                        break;
                    } else {
                        if (nums[i] == 0) {
                            currentmaxconsecutiveones = 0;
                        } else {
                            ++currentmaxconsecutiveones;
                        }
                    }
                }
                if (currentmaxconsecutiveones > maxconsecutiveones) {
                    maxconsecutiveones = currentmaxconsecutiveones;
                }
            }
        }
        return maxconsecutiveones;
    }
}
