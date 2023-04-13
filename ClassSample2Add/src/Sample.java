import java.util.Scanner;

public class Sample {
	public static void main(String ar[]) {
		
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter 2 number");
		
		int num1=a.nextInt();
		int num2=a.nextInt();

		
		Sum s=new Sum();
		
		s.calculate(num1, num2);
		s.displaySum();
	}

}
