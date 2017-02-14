public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzbuzz = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzbuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzbuzz.add("Buzz");
            } else {
                fizzbuzz.add("" + i);
            }
        }
        return fizzbuzz;
    }
}
