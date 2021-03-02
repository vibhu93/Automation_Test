package TEST_Package;

public class ExceptionHandled2 {

	public static void main(String[] args) {

		try {
			test();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void test()throws Exception{

		System.out.println("Welcome To Automation World ");
		throw new ArithmeticException("Not Valid Operation");
		//int i=1/0;
		//System.out.println("Completed");
	}
}



