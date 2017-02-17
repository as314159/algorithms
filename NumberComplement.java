public class NumberComplement {
    public int findComplement(int num) {
        String numToBinaryStr = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
            sb.append("-");
        }
        for (int i = 0; i < numToBinaryStr.length(); i++) {
            if (numToBinaryStr.charAt(i) == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        int numComplement = Integer.parseInt(sb.toString(), 2);
        return numComplement;
    }
}
