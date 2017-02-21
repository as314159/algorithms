public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        // negative area - illegal
        if (area < 0) {
            return new int[] {0, 0};
        }
        
        // zero area - illegal
        else if (area == 0) {
            throw new ArithmeticException("/ by zero");
        } 
        
        // if area == 1; then return l = 1 and w = 1
        // if area == 2; then return l = 2 and w = 1
        // if area == 3; then return l = 3 and w = 1
        else if (area <= 3) {
            return new int[] {area, 1};
        }
        
        int[] multiples = {};
        
        // if area == 4; then multiples[] = {1, 4, 2}
        // if area == 6; then multiples[] = {1, 6, 2, 3}
        if (area <= 6) {
            multiples = new int[4];
        } 
        
        // assuming for all other areas multiples[] of size area/2 required
        else {
            multiples = new int[area/2];
        }
        
        int count = -1;
        multiples[++count] = 1;
        multiples[++count] = area;
        for (int i = 2; i <= (area/2); i++) {
            if (area % i == 0) {
                multiples[++count] = i;
            }
        }
        Set<Integer> multiplesSet = new HashSet<Integer>(count);
        multiplesSet.add(1);
        multiplesSet.add(area);
        int[] optimalRect = new int[2];
        optimalRect[0] = area;
        optimalRect[1] = 1;
        for (int i = 2; i <= count; i++) {
            int twoProduct = area / multiples[i];
            if (!multiplesSet.contains(twoProduct)) {
                
                // if area == 4 (or any whole square); then multiples[] = {1, 4, 2}
                // thus, multiples[i] = area/multiples[i] and return l, w = multiples[i]
                if (multiples[i] == twoProduct) {
                    optimalRect[0] = optimalRect[1] = multiples[i];
                    break;
                }
                multiplesSet.add(multiples[i]);
            } else {
                if (optimalRect[0] - optimalRect[1] > multiples[i] - twoProduct) {
                    optimalRect[0] = multiples[i];
                    optimalRect[1] = twoProduct;
                }
            }
        }
        return optimalRect;
    }
}
