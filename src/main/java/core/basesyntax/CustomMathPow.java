package core.basesyntax;

public class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     *      number - число которое надо возводить в какую-то степень
     *      exponential - значение степени
     */
    public int pow(int number, int exponential) {
        if (number == 0) {
            return 0;
        } else if (number == 1 || (number == 0 && exponential == 1)) {
            return 1;
        } else {
            for (int i = 1; i < exponential; i++) {
                number += number;
            }
            return number;
        }
    }
}
