package core.basesyntax;

public class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     *      number - число которое надо возводить в какую-то степень
     *      exponential - значение степени
     */
    public int pow(int number, int exponential) {
        /* int countNumber= 1;
        for (int i=1; i<=exponential; i++) {
            countNumber = countNumber*number;
        } */
        return (int)  StrictMath.pow(number,exponential);
    }
}
