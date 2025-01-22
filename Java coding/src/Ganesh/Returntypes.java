package Ganesh;

public class Returntypes {

	public Integer A=1000;
	
	public Integer Returntype() {
		System.out.println("Returning amount " +A);
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Returntypes obj=new Returntypes();
      Integer B=obj.Returntype();
      System.out.println("Received amount "+B);
	}

}
