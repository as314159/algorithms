public class NextGreaterElement {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int findnumslen = findNums.length;
        int numslen = nums.length;
        int[] nextGreatestElements = new int[findnumslen];
        for (int i = 0; i < findnumslen; i++) {
            for (int j = 0; j < numslen; j++) {
                if (findNums[i] == nums[j]) {
                    if (j == numslen - 1) {
                        nextGreatestElements[i] = -1;
                    } else {
                        int k = j;
                        boolean nextgreatest = false;
                        while (k++ != numslen - 1) {
                            if (findNums[i] < nums[k]) {
                                nextGreatestElements[i] = nums[k];
                                nextgreatest = true;
                                break;
                            }
                        }
                        if (!nextgreatest) {
                            nextGreatestElements[i] = -1;
                        }
                    }
                }
            }
        }
        return nextGreatestElements;
    }
}
