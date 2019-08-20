package core.basesyntax;

class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     * number - число которое надо возводить в какую-то степень
     * exponential - значение степени
     */
    public int pow(int number, int exponential) {
        int y = 1;
        if (exponential < 0) {
            number = 1 / number;
            exponential = -exponential;
        }
        if (exponential == 0) {
            return 1;
        }
        while (exponential > 1) {
            if (exponential % 2 == 0) {
                number *= number;
                exponential = exponential / 2;
            } else {
                y = number * y;
                number *= number;
                exponential = (exponential - 1) / 2;

            }
        }
        return number * y;
    }
}