package JavaconceptsExamples;

import java.util.ArrayList;

public class List1 {
	  public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.get(0));
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
	    }
	      System.out.println(cars.get(0));
	      System.out.println(cars.set(0, "Opel"));
	    }
	  }
	