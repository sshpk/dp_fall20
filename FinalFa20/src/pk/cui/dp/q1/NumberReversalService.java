package pk.cui.dp.q1;

import java.util.concurrent.Callable;

public class NumberReversalService implements Callable<Integer> {
	private int number;

	public NumberReversalService(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		return reverse();
	}

	private Integer reverse() throws InterruptedException {
		int reversedNumber = 0;
		int temp = 0;

		while(number > 0){

			//use modulus operator to strip off the last digit
			temp = number%10;

			//create the reversed number
			reversedNumber = reversedNumber * 10 + temp;
			number = number/10;

		}
		return reversedNumber;
	}
}
