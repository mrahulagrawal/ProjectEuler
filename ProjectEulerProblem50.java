
public class ProblemEulerProblem50{
	
	public static final int INPUT_NUMBER=1000000;
	
	public static int[] getPrimeSeries(int n){
		boolean[] numbers=new boolean[n];
		for(int i=0;i<n;i++)
			numbers[i]=true;
		int root=(int)Math.sqrt(n);
		numbers[0]=false;
		numbers[1]=false;
		for(int i=2;i<=root;i++){
			if(numbers[i]){
				int l=i*i;
				for(int k=0;k<n;k++){
					int j=l+(k*i);
					if(j>=n) break;
					numbers[j]=false;
				}
			}
		}
		int primeCount=0;
		for(int i=0;i<n;i++){
			if(numbers[i]){
				//System.out.println(i);
				++primeCount;
			}
		}
		int count=0;
		int [] primeSeries=new int[primeCount];

		for(int i=2;i<n;i++){
			if(numbers[i]){
				primeSeries[count]=i;
				++count;
			}
		}

		return primeSeries;
	}
	public static void main(String...args){
		long startTime=System.currentTimeMillis();
		int[] primeSeries=getPrimeSeries(INPUT_NUMBER);
		int seriesLength=primeSeries.length;
		System.out.println(seriesLength);
		System.out.println(primeSeries[seriesLength-1]);
		boolean isSumPrime=false,totalSeries=true;
		int sum=0;
		for(int i=seriesLength-1;i>=1 && !isSumPrime;i--){
			for(int j = 0;(seriesLength-1-i)-j>=0 && !isSumPrime;j++){
				sum=0;
				totalSeries=true;
				int cnt=i;
				for(int k=(seriesLength-1)-j;cnt>=0;k--){
					cnt--;
					sum+=primeSeries[k];
					if(sum>INPUT_NUMBER){
						totalSeries=false;
						sum=0;
						break;
					}					
				}
				for(int m=seriesLength-1;m>=0 && totalSeries;m--){
					if(sum==primeSeries[m]){
						isSumPrime=true;
						System.out.println("Sum: "+sum);
						System.out.println("Count of series: "+i);
						break;
					}
					if(sum>primeSeries[m]) break;
				}	
			}
						
		}
		
		System.out.println("Time Take:"+((System.currentTimeMillis()-startTime)));
	}
}
