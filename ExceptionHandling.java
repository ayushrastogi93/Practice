import java.io.IOException;


/* exception in try -> is handled by respective catch
 * exception in catch -> cant be handled by other catch
 *  */
public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int i = 5;
try {
	if (i<10) {
		throw new IOException("error");
	}
}	
catch(IOException e) {
	System.out.println(4);
	System.out.println(4/0);
}
catch(ArithmeticException e) {
	System.out.println(5);
	System.out.println(5/0);
}
finally{
	System.out.println("h");
}
	}

}
