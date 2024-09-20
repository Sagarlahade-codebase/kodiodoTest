package problems;

public class EvenOddSum {
	
	public static void printSum(Integer value) {
		
		int digit =0;
		int evenSum=0;
		int oddSum=0;
		while(value%10!=0) {
			digit=value%10;
			if(digit%2==0) {
				evenSum=evenSum+digit;
				
			}else {
				oddSum=oddSum+digit;
				
			}
			value=value/10;
			
		}
		
		System.out.println("Even Sum is : "+ evenSum);
		System.out.println("Odd Sum is : "+ oddSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSum(13245);
	}

}
