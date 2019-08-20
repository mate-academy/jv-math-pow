package core.basesyntax;

public class CustomMathPow {
    public int pow(int number, int exponential) {
        if (exponential < 1) return 1;
        return number * pow(number, exponential - 1);
    }
}
