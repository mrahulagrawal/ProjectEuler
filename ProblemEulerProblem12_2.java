
public class ProblemEulerProblem12_2{
	public static void main(String...strings){
		long startTime=System.currentTimeMillis();
		long Triangle = 0;
		long i = 1;
		while (true)
		{
			Triangle += i++;
			int count = 0;
			long div = Triangle;
			for (long j = 1; j < div; j++)
			{
				if (Triangle % j == 0)
				{
					div = Triangle / j;
					if (j != div) count += 2;
					else count += 1;
				}
			}
			if (count > 500)
			{
				System.out.println("Time(in millsec.):"+(System.currentTimeMillis()-startTime));
				System.out.println(Triangle);
				break;
			}
		}
	}
}
/** Runs in 3 secs for 500 factors */
