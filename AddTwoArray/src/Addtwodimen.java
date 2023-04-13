import java.util.Scanner;

public class Addtwodimen {
	
	public static void main(String a[]) {
		int[][] array1=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		
		int size=sc.nextInt();
		
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array1[i][j]=sc.nextInt();
			}
			
			System.out.println();
		}
		
		int[][] array2=new int[size][size];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array2[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
	}
	

}
