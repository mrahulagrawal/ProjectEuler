public class ProjectEulerProblem9{
	public static void main(String[] s){
		int a,b,c;
		for(int i=1;i<1000;i++){
			for(int j=i+1;j<1000;j++){
				for(int k=j+1;k<1000;k++){
					if((i+j+k)==1000){
						a=(int)Math.pow(i, 2);
						b=(int)Math.pow(j, 2);
						c=(int)Math.pow(k, 2);
						if((a+b)==c){
							System.out.println("Numbers are: "+i+", "+j+", "+k);
							System.out.println("Product: "+i*j*k);
							break;
						}
					}
					
				}
			}
		}
	}
}
//31875000
//200, 375, 425
// 40000+140625=180625
