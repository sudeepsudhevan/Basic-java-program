
public class Hello {
	 int a=10;
	static int b=20;
	public static void main(String hai[]) {
		
		Hello h=new Hello();
		Hello h1=new Hello();
		System.out.println(h.a);
		h.hello();
		
		h.b=50;
		
		h.a=100;
		
		h1.b=100;
		
		h1.a=1500;
		
		b=2000;
				
		hey();
		
		System.out.println("h.a "+h.a);
		System.out.println("h.b "+h.b); //b is static variable9
		System.out.println("h1.a "+h1.a);
		System.out.println("h1.b "+h1.b);
		System.out.println(b);
	}
	
	
	void hello() {
		
		System.out.println("hello "+a);
		
	}
	static void hey() {
		System.out.println("hey "+b);
	}
	
}
