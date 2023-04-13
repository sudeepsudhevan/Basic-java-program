
public class Sample extends Hello {

	@Override
	void onText(String text) {
		
		System.out.println(text);
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	Sample(){
		TextScanner ts=new TextScanner(this);
		ts.scan();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		
	}
	

}
