package TEST_Package;

public class ExceptionHandled {

	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		try{
			System.out.println("Welcome To Automation World ");
			int i=1/0;
			System.out.println("Completed");
		}
		catch(Exception exc){
			System.out.println("expection inside catch box");
			System.out.println("Messages is" +exc.getMessage());
			System.out.println("Cause is "+exc.getCause());
			exc.printStackTrace();
			
		}
		
		finally {
			System.out.println("Exception inside finnaly block");
		}
		
		
	}
	

}
