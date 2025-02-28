package JavaconceptsExamples;
public class Exceptionhandling {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a % b;
			System.out.println("added value is " + c);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
