
public class code2 {
	
	
  public int collectedamount=500;
  
  public int collectedamountgiveittome()
  {
	  System.out.println("checking collected amount " +collectedamount);
	  return collectedamount;
  }
  
	public static void main(String[] args) 
	{
		code2 amount=new code2();
		int money=amount.collectedamountgiveittome();
		System.out.println("Collected amount is "+money);
		

	}

}
