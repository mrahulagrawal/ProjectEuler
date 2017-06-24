public class ProjectEulerProblem10_2{
	public static void main(String...strings ){
		long x=System.currentTimeMillis();
		int count=0;
		long sum=0;
		int n=2000000;
		boolean[] A=new boolean[n];
		for(int i=0;i<n;i++) A[i]=true;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(A[i]){
				for(int j=i*i;j<n;){
					A[j]=false;
					j+=i;
				}
			}
		}
		for(int i=2;i<n;i++){
			if(A[i]){
				sum+=i;
			}
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-x);
	}
}
//142913828922
//55 milliseconds
