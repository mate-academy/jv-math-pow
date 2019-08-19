package core.basesyntax;

public class CustomMathPow {
    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     *      number - число которое надо возводить в какую-то степень
     *      exponential - значение степени
     */
    public int pow(int number, int exp) {
        // negative numbers and negative exp remains unchecked
        if (exp == 0) {
            return 1;
        }
        int res = number;
        for (int i = 1; i < exp; i++) {
            res *= number;
        }
        return res;
    }
}
