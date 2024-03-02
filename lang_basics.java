package Assignments;

public class lang_basics {
	
	//biggest number
	public static void Asignment (String[] args) {
	
		if (args.length<3){
			System.out.println("The command line inputs are: ");
			return;
		}
		double num1=Double.parseDouble(args[0]);

		double num2=Double.parseDouble(args[1]);
		double num3=Double.parseDouble(args[2]);
		
		double biggest=num1;
				
				if (num2>biggest) {
					biggest =num2;
				}
		if (num3>biggest) {
			biggest =num3;
		}
		
	System.out.println("The Biggest Number is: "+biggest);
	}
	
	//daynumber
	public static void Assignment1 (String[] args) {
		if(args.length!=1) {
			System.out.println("The command line inputs are:");
			return;
		}
		int dayNumber =Integer.parseInt(args[0]);
		
		String dayWord;
		switch(dayNumber) {
		case 1:
			dayWord ="Monday";
			break;
		case 2:
			dayWord ="Tuesday";
			break;
		case 3:
			dayWord ="wednesday";
			break;
		case 4:
			dayWord ="Thursday";
			break;
		case 5:
			dayWord ="friday";
			break;
		case 6:
			dayWord ="Saturday";
			break;
		case 7:
			dayWord ="sunday";
			break;	
			default:
				dayWord="invalid day number ";
			
	}
	
	System.out.println("The entered day: "+dayWord);
	}
	
	
	//Array
	public static void Assignment3 (String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		int elementToFind=5;
		int index =searchElement(arr,elementToFind);
		if (index !=1) {
			System.out.println("Element " + elementToFind + " found at index " + index + ".");
		}
		else
			System.out.println("Element " + elementToFind + " not found at index " + index + ".");
			
		}
	public static int searchElement(int[]arr,int element) {
		for (int i=0;i<arr.length;i++){
			if(arr[i] ==element) {
				return i;
			}
		}
		return -1;
	}
		
		
		//3x3 matrices
		public static void Assignment4 (String [] args) {
			int [][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
			int [][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};
			
			int [][] sumMatrix = new int [3][3];
			//calculate sum of matrices
for (int i=0;i<3;i++) {
	for (int j=0;j<3;j++) {
sumMatrix[i][j] =matrix1[i][j]+matrix2[i][j];		
}
}
	System.out.println("sum of matrices:");	
	for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++) {
System.out.print(sumMatrix[i][j] +"  ");		
	}
		System.out.println();
	}}
	
	//factorial
	
	public static void Assignment5 (String [] args ) {
		int num=5;
		long fact=findFactorial(num);
		System.out.println("Factorial of " + num + "is :" +fact);
	}
	public static long findFactorial(int n) {
		if(n==0||n==1) {
		return 1;
		}else {
			return n *findFactorial(n-1);
		}
		}
	//multiplication
	public static void Assignment6 (String[] args) {
		int num=5;
		System.out.println("Multiplication table of "+ num +":");

		for(int i=0;i<=10;i++) {
			System.out.println(num + "x" +i +"=" + (num *i));
		}
	}
	
	
	}
	
	
