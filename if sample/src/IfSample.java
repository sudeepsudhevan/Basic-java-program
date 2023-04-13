import java.util.Scanner;

public class IfSample {
	
	public static void main(String a[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is positive");
		}
		
		
		
		}
	
}
