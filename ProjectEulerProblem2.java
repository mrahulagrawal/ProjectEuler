public class EulerTest2
{
	public static void main(String... args)
	{
		long prev=1, current=1,next=0,sum=0;
		while(current<4000000)
		{
			next=prev+current;
			if(next%2 == 0)
			{
				sum+=next;
			}
			prev=current;
			current=next;			
		}
		System.out.println("Sum of Fabonacci Series:"+sum);
	}
}
