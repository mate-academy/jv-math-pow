package core.basesyntax;

@SuppressWarnings("ALL")
public class CustomMathPow {
    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     *      number - число которое надо возводить в какую-то степень
     *      exponential - значение степени
     */
    public int pow(int number, int exponential) {
        if ( number < 0 || exponential < 0) {
            throw new IllegalArgumentException("Number and Exponential must be positive number");
        }
    	if ( exponential == 0 ) return 1;
    	if ( number == 0 ) return 0;

		int retValue = 1;
    	while(exponential > 0){
    		if( (exponential&1) == 1 ){
    			retValue = retValue*number;
    		}
    		exponential = exponential >> 1;
			number = number*number;
			//System.out.println(retValue);
    	}
		System.out.println(retValue);
    	return retValue;
    }
}
