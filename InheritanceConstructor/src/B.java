
public class B extends A {
	B(){
		System.out.println("it is B");
	}
	
	
	
	public static void main(String[] args) {
		B b=new B();
	}
		
// here initially execute constructor in base class(Class A) then the constructor in the child class(Class B)

}
