public class ProjectEulerProblem10{
	public static boolean isPrime(int x){
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	public static void main(String...strings){
		long x=System.currentTimeMillis();
		long sum=17;
		for(int i=11;i<=2000000;i++){
			if(isPrime(i)) sum+=i;
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-x);
	}
}
//142913828922
//1103 milliseconds