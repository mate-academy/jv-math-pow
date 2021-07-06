package core.basesyntax;

public class CustomMathPow {

    public int pow(int number, int exponential) {
        int result  = 1;
        if (exponential == 0) {
            return result;
        }
        for (int i = 1; i <= exponential; i++) {
            result *= number;
        }
        return result;
    }
}
