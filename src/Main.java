//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
        AdvancedCalculator advCalc = new AdvancedCalculator(10);
        int resultat = advCalc.divide(2).power(4).root(2).result();
        System.out.println("b) " + resultat);
    }
}