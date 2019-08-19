package core.basesyntax;

public class CustomMathPow {
    private int maxInt = pow(2, 32);

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     * number - число которое надо возводить в какую-то степень
     * exponential - значение степени
     */
    public int pow(int number, int exponential) {
        long result = 1;
        for (int i = 0; i < exponential; i++) {
            result *= number;
            if (result >= maxInt) {
                return maxInt;
            }
        }
        return (int) result;
    }
}
