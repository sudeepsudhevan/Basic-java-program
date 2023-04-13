
public class Hello {
	
	public static void main(String[] args) {
		ThreadSample st=new ThreadSample();
		
		st.start();
		ThreadSample st1=new ThreadSample();
		st1.start();
		
		ThreadSample st2=new ThreadSample();
		
		
		st2.start();
	}
}
