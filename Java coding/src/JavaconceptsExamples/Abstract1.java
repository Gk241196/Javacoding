package JavaconceptsExamples;

public class Abstract1 extends Abstraction implements Interface
{
	public void java(){
		  System.out.println("Printing the java");  
	  }
  public void selenium(){
	  System.out.println("printing the selenium");
  }
  public void automation(){
	  System.out.println("Printing the automation");
  }
  public static void main(String args[]) {
	  Abstraction obj1=new Abstract1();
	obj1.selenium();
	obj1.java();
	Interface obj2=new Abstract1();
	obj2.automation(); 
  }
}



