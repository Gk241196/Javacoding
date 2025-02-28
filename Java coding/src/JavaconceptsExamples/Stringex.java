package JavaconceptsExamples;
import java.lang.String;
public class Stringex {
	public static void main(String[] args) {
		// String with boolean
		String name = "ganesh";
		String Lname = "kumar";
		boolean status = name.equals(name);
		System.out.println("His name is " + name);
		// String concept
		String G = "ganesh kumar moni";
		String[] splittedString = G.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println("The length of the string is " + G.length());
		// Reverse a given string
		for (int i = G.length() - 1; i >= 0; i--) {
			System.out.println(G.charAt(i));
		}
	}
}
