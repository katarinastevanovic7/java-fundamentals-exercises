package exercise10.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        double answerMult = calculator.mult(123, 45);
        System.out.println(calculator.add(answerMult, 4465));
    }
}

