import java.util.*;
public class ProjectEulerProblem17{

	public static void main(String...arg){
		int sum=0;
		for(int i=1;i<=1000;i++){
			String inWords=getInWords(i);
			sum+=inWords.length();
		}
		System.out.println(sum);
	}
	public static String getInWords(int i){
		String result="";
		Map<Integer, String> wordMap = new HashMap<Integer, String>();
		
		wordMap.put(1, "One");
		wordMap.put(2, "Two");
		wordMap.put(3, "Three");
		wordMap.put(4, "Four");
		wordMap.put(5, "Five");
		wordMap.put(6, "Six");
		wordMap.put(7, "Seven");
		wordMap.put(8, "Eight");
		wordMap.put(9, "Nine");
		wordMap.put(10, "Ten");
		wordMap.put(11, "Eleven");
		wordMap.put(12, "Twelve");
		wordMap.put(13, "Thirteen");
		wordMap.put(14, "Fourteen");
		wordMap.put(15, "Fifteen");
		wordMap.put(16, "Sixteen");
		wordMap.put(17, "Seventeen");
		wordMap.put(18, "Eighteen");
		wordMap.put(19, "Nineteen");
		wordMap.put(20, "Twenty");
		wordMap.put(30, "Thirty");
		wordMap.put(40, "Forty");
		wordMap.put(50, "Fifty");
		wordMap.put(60, "Sixty");
		wordMap.put(70, "Seventy");
		wordMap.put(80, "Eighty");
		wordMap.put(90, "Ninety");
		wordMap.put(100, "Hundred");
		wordMap.put(1000, "Thousand");

		if(i<=20 || (((i%10)==0) && i<=99)){
			result=wordMap.get(i);
		}
		else if(i>20 && i<=99){
			result=getInWords(((int)i/10)*10)+getInWords(i%10);
		}
		else if(i>=100 && i<1000){
			result = getInWords((int) i/100)+wordMap.get(100);
			
			if(i%100 != 0)
				result+="and"+getInWords(i%100);
		}
		else if(i==1000)
			result="OneThousand";
		
		return result;
	}
	
}
