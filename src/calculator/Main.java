package calculator;

import exceptions.IncorrectInput;
import exceptions.RomanCannotBeLessThenOne;

public class Main {
    public static void main(String[] args) throws RomanCannotBeLessThenOne, IncorrectInput {
    Calculator calculator = new Calculator();
    calculator.calculate();
    }
}
