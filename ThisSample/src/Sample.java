
public class Sample {
	int a=25,b=35;         // global variable construct
	
	
	Sample(int a,int b){   // local variable inside construct
		
		this.a=a;
		this.b=b;
		
		
		System.out.println(this.a+" "+this.b);  
		
		
	}

}
