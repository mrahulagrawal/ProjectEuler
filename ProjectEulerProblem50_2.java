import java.util.ArrayList;

public class ProjectEulerProblem50_2 {
	long nextPrime = 3L;
	long largestConsecutiveSum = 0;
	ArrayList<Long> primeNumbers = new ArrayList<Long>(){{add(2L);add(3L);}};
	long limit = 1000000;
	
	public void init() {
		while (true) {
			nextPrime = generateNextPrimeNumber(nextPrime);

			if (getPrimeSum() > limit)
				break;
		}
				
		for (int i=primeNumbers.size()-1; i>=0; i--) {
			long sum = 0;
			for (int j=i-1; j>=0; j--) {
				if (sum > limit)
					break;
				if (isPrime(sum) && sum > largestConsecutiveSum)
				{
					largestConsecutiveSum = sum;
				}
				sum += primeNumbers.get(j);
			}
		}
		System.out.println("Largest Consecutive Sum below "+limit+" is: " + largestConsecutiveSum);
	}
	
	private boolean isPrime(long primeSum) {
		boolean flag = true;
		if (primeSum % 2 ==0) 
			return false;
		for (int i=3; i<Math.floor(Math.sqrt(primeSum))+1; i+=2) {
			if (primeSum % i == 0)
				return false;
		}
		return flag;
		
	}

	public long getPrimeSum() {
		long sum = 0;
		for (long curr: this.primeNumbers) {
			sum += curr;
		}
		return sum;
	}
	
	private long generateNextPrimeNumber(long currPrime) {
		long nextPrime = currPrime+2;
		boolean flag = true;
		for (long prime: primeNumbers) {
			if (nextPrime%prime==0) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			primeNumbers.add(nextPrime);
			return nextPrime;
		} else {
			return generateNextPrimeNumber(nextPrime);
		}
	}

	public static void main(String [] args) {
		ProjectEulerProblem50_2 cps = new ProjectEulerProblem50_2();
		long startTime = System.currentTimeMillis();
		cps.init();
		System.out.println("Total Time Taken: " + (System.currentTimeMillis()-startTime));
	}
}
