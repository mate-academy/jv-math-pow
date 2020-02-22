package core.basesyntax;

public class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     * number - число которое надо возводить в какую-то степень
     * exponential - значение степени
     */

    public int pow(int number, int exponential) {
        int result;
        if (exponential == 0) {
            result = 1;
        } else if (exponential < 0) {
            result = 0;
        } else {
            result = number;
            for (int i = 1; i < exponential; i++) {
                result *= number;
            }
        }
        return result;
    }
}
