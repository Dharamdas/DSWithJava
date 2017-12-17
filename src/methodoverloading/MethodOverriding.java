package methodoverloading;

import java.io.File;
import java.io.IOException;


/* 1. access modifer should not be more restrictive
 * 2. return type can be change but must be covarient type
 * 3. unchecked exception can be thrown from subclass
 * 4. checked exception can not be thrown from subclass
 * 5. if super class declear as checked exp, so unchecked exception can 
 * be thrown from subclass 
 * */
public class MethodOverriding {

	public static void main(String[] args) {

	}
	// for access modifire
	 protected void  m()
	 {
		 System.out.println("Super Class");
	 }
	 //for return type
	 protected Number  m1()  
	 {
		 System.out.println("Super Class");
		 return 0;
	 }
	 //unchecked for exception
	 void m2()
	 {
		 
	 }
	 void m3()
	 {
		 
	 }
	 
	 void m4() throws IOException
	 {
		 
	 }
	 void m5() throws NullPointerException
	 {
		 
	 }
	 
}
class BaseClass extends MethodOverriding{
	
	//should not be more restictive  
	public void  m()
	 {
		 System.out.println("Super Class");
	 }
	//return type 
	protected Integer  m1()  
	 {
		 System.out.println("Super Class");
		 return 0;
	 }
	//allow only for unchecked exception
	 void m2()throws NullPointerException
	 {
		 
	 }
	 //for checked exception
	 void m3() throws IOException
	 {
		 
	 }
	 void m4()throws NullPointerException
	 {
		 
	 }
	void m5()throws IOException
	{
		File f = new File("");
	}
}