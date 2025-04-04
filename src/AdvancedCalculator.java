public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int initialValue) {
        super(initialValue);
    }


    public AdvancedCalculator divide(int value) {
        if (value == 0) {
            throw new ArithmeticException("Impartire la zero!");
        }
        int current = this.result() / value;
        this.clear().add(current);
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        int base = this.result();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        this.clear().add(result);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Radical de ordin invalid!");
        }
        double result = Math.pow(this.result(), 1.0 / n);
        this.clear().add((int) result);
        return this;
    }


}
