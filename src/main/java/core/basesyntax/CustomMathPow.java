package core.basesyntax;


public class CustomMathPow {
    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     * number - число которое надо возводить в какую-то степень
     * exponential - значение степени
     */
    public int pow(int number, int exponential) {
        if (number <= 0 || exponential <= 0) {
            if (number == 0) {
                return 0;
            } else if (exponential == 0) {
                return 1;
            } else {
                throw new IllegalArgumentException("number and exponential must be positive");
            }
        }
        int returnValue = 1;
        while (exponential > 0) {
            returnValue = returnValue * number;
            exponential--;
        }
        return returnValue;
    }
}
