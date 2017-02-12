public class Solution {
    public int hammingDistance(int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }
        StringBuilder sbx = null;
        StringBuilder sby = null;
        // while (x > 0) {
        //     int modx = x % 2;
        //     if (modx == 1) {
        //         sbx.append("1");
        //     } else {
        //         sbx.append("0");
        //     }
        //     x = x / 2;
        // }
        // while (y > 0) {
        //     int mody = y % 2;
        //     if (mody == 1) {
        //         sby.append("1");
        //     } else {
        //         sby.append("0");
        //     }
        //     y = y / 2;
        // }
        sbx = new StringBuilder(Integer.toBinaryString(x));
        sby = new StringBuilder(Integer.toBinaryString(y));
        int lensbx = sbx.length();
        int lensby = sby.length();
        int len = -1;
        if (lensbx > lensby) {
            len = lensbx;
            while (sbx.length() != sby.length()) {
                sby.insert(0, "0");
            }
        } else {
            len = lensby;
            while (sbx.length() != sby.length()) {
                sbx.insert(0, "0");
            }
        }
        sbx = sbx.reverse();
        sby = sby.reverse();
        int z = 0;
        for (int count = 0; count < len; count++) {
            if (sbx.charAt(count) != sby.charAt(count)) {
                ++z;
            }
        }
        return z;
    }
}
