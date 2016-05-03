import java.util.Scanner;

public class Day3Example2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask the user to enter a start value and an end value
		
		double start, end, cel, far;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a start value: ");
		start = input.nextDouble();
		System.out.println("Enter and end value: ");
		end = input.nextDouble();
		
		if (start > end ){
			System.out.println(" Sorry that is not a valid range");
			
		} else {
			System.out.println(" Conversion from Celcius to Fahrenheit");
			for (cel = start; cel <=end; cel = cel + 1){
				far = (cel * 9.0 / 5.0) + 32;
				System.out.println(cel + "celcius = " + far + " fahrenheit ");
				
				
			}
			
		}
		
		

	}

}
