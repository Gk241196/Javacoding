package Ganesh;
import java.util.HashSet;
public class Set {
	public static void main(String[] args) {
		HashSet<String> objs=new HashSet<>();
		objs.add("Ganesh");
		objs.add("moni");
		objs.add("kumar");
		System.out.println(objs);
	}

}
//Save this file as amazon/products/Electronics.java
package amazon.products;

public class Electronics {
 public void display() {
     System.out.println("Welcome to Amazon Electronics Store!");
 }
}

//Save this file as AmazonMain.java
import amazon.products.Electronics;

public class AmazonMain {
 public static void main(String[] args) {
     Electronics product = new Electronics();
     product.display();
 }
}
